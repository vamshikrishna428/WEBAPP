package com.flipkart.testscript;

import org.testng.annotations.Test;

import com.flipkart.genericutility.BaseClass;

public class SearchProduct extends BaseClass {
	
	
	 @Test
	 public void searchProuct() throws InterruptedException {
		
		addtocart.cancelMark();
		
		String name = excelutility.getExcelData("Sheet1", 0, 0);
		addtocart.searchTxBx(name);
		addtocart.searchIcon();
		
		addtocart.clickOnProduct();

		String actual = addtocart.getWinterheaterText();
		System.out.println(actual);
		productpage.switchWindow(webdriverutility);
		String expected = productpage.productInCart();
		System.out.println("text " +expected);
	}

//	private String contains(String browser) {
//		return browser;
//	}
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