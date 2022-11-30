package org.flikart.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	WebDriver driver;
	public AddToCart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//	public AddToCart(WebDriver driver) {
	//		PageFactory.initElements(driver, this);
	//	}

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement cancelmark;

	@FindBy(xpath = "//input[@name='q']")
	private WebElement searchtxbx;

	@FindBy(xpath="//button[@type='submit']/*")
	private WebElement searchIcon;

	@FindBy(xpath="//div[@class='_13oc-S']/child::div/child::div[@class='_4ddWXP']/child::a[@class='s1Q9rs']")
	private WebElement firstTextWinterheater;

	@FindBy(xpath="//div[@class='_13oc-S']/child::div/child::div[@class='_4ddWXP']/child::a[@class='s1Q9rs']")
	private WebElement winterheaterText;

	public void cancelMark() {
		cancelmark.click();
	}
	public void searchTxBx(String value) {
		searchtxbx.sendKeys(value);
		searchtxbx.click();
	}
	public void searchIcon() {
		searchIcon.click();
	}

	public String getWinterheaterText() {
		return firstTextWinterheater.getText().trim();
	}

	public String winterHeaterProduct() {
		return winterheaterText.getAttribute("title").trim();

	}
	public void clickOnProduct() {
		winterheaterText.click();
	}

}

