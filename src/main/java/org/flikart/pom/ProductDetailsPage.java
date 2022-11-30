package org.flikart.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.genericutility.WebDriverUtility;

public class ProductDetailsPage {
	
	WebDriver driver;
	public ProductDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	public  ProductDetailsPage(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//	}
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement 	addToCartButton;

	@FindBy(xpath="//div[@class='_2-uG6-']/child::a[@class='_2Kn22P gBNbID']")
	private WebElement productText;
	
	private String product="//a[.='%s']";
	
	public void clickAddToCart() {
		addToCartButton.click();
	}
	
	public void switchWindow(WebDriverUtility webdriverutility) {
		webdriverutility.switchWindow();
		addToCartButton.click();
		
	}
	public String productInCart() {
	 return productText.getText().trim();
	
	}
	private WebElement convertDynamicxpathToWebElement(String xpath,String replace) {
		xpath=String.format(xpath, replace);
	return	driver.findElement(By.xpath(xpath));
	}
	public void clickOnProduct(String replace) {
		convertDynamicxpathToWebElement(product , replace).click();
		
		}

	
}
