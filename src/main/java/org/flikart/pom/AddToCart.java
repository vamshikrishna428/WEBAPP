package org.flikart.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
private WebElement cancelmark;

@FindBy(xpath = "//input[@name='q']")
private WebElement searchtxbx;

public void cancelMark() {
	cancelmark.click();
}
public void searchTxBx(String value) {
	searchtxbx.sendKeys(value);
	searchtxbx.click();
}
}

