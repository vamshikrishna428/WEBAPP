package com.flipkart.genericutility;

import org.flikart.pom.AddToCart;
import org.flikart.pom.ProductDetailsPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public ExcelUtility excelutility;
	public FileUtility fileutility;
	public JavaUtility javautility;
	public WebDriverUtility webdriverutility;

	public String browser;
	public String url;
	public String time;

	public long timeouts;

	public WebDriver driver;

	public AddToCart addtocart;
	public ProductDetailsPage productpage;

	@BeforeClass

	public void setupdriver() {
		excelutility=new ExcelUtility();
		fileutility=new FileUtility();
		javautility=new JavaUtility();
		webdriverutility=new WebDriverUtility();

		// initialize the data from property file
		fileutility.InitializePropertyFile(IConstants.FLIPKARTPROPERTYPATH);
		excelutility.Initialize(IConstants.FLIPKARTEXCELPATH);

		// fetch the data from property file
		browser = fileutility.getDatafromPropertyFile("browser");
		url = fileutility.getDatafromPropertyFile("url");
		time = fileutility.getDatafromPropertyFile("timeouts");

		timeouts = javautility.ConvertStringToLong(time);

		// launching the browser in the run time based on browser key
		driver=webdriverutility.setUpDriver(browser);

		webdriverutility.MaximizeBrowser();
		webdriverutility.WaitImplicitly(timeouts);

		addtocart=new AddToCart(driver);
		productpage=new ProductDetailsPage(driver);



	}

	@BeforeMethod
	public void openApplication() {
		webdriverutility.geturl(url);
	}
	@AfterMethod
	public void methodTearDown() {

	}
	@AfterClass
	public void closeApplication() {

	}



}
