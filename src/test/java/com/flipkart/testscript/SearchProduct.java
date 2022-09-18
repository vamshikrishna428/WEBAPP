package com.flipkart.testscript;

import org.flikart.pom.AddToCart;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.flipkart.genericutility.ExcelUtility;
import com.flipkart.genericutility.FileUtility;
import com.flipkart.genericutility.IConstants;
import com.flipkart.genericutility.JSExecutorUtility;
import com.flipkart.genericutility.JavaUtility;
import com.flipkart.genericutility.WebDriverUtility;

public class SearchProduct {
	
	static WebDriver driver;
	 @Test
	 public void searchProuct() throws InterruptedException {
	
		ExcelUtility excelutility=new ExcelUtility();
		FileUtility fileutility=new FileUtility();
		JavaUtility javautility=new JavaUtility();
		JSExecutorUtility javascriptutility=new JSExecutorUtility();
		WebDriverUtility webdriverutility=new WebDriverUtility();
		

		AddToCart addtocart=new AddToCart(driver);
		
		// initialize the data from property file
		fileutility.InitializePropertyFile(IConstants.FLIPKARTPROPERTYPATH);
		excelutility.Initialize(IConstants.FLIPKARTEXCELPATH);
		
		// fetch the data from property file
		String browser = fileutility.getDatafromPropertyFile("browser");
		String url = fileutility.getDatafromPropertyFile("url");
		String time = fileutility.getDatafromPropertyFile("timeouts");
		long timeouts = javautility.ConvertStringToLong(time);

		// launching the browser in the run time based on browser key
		webdriverutility.setUpDriver(browser);
		webdriverutility.MaximizeBrowser();
		webdriverutility.WaitImplicitly(timeouts);
		webdriverutility.geturl(url);
		Thread.sleep(3000);
		
		addtocart.cancelMark();
		String name = excelutility.getExcelData("Sheet1", 1, 1);
		addtocart.searchTxBx(name);



		






	}
}

/*		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Winter heater");

	}

}
 */