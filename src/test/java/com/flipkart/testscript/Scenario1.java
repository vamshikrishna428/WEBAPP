package com.flipkart.testscript;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario1 {

	@Test
	public void scenario1() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Winter heater"+Keys.ENTER);

		String pr1 = driver.findElement(By.xpath("//div[@data-id='ROHG9R5RWDHK9V2T']/descendant::a[@class='s1Q9rs']")).getText();
		System.out.println(pr1);
		Thread.sleep(3000);
		WebElement firstproduct = driver.findElement(By.xpath("//div[@data-id='ROHG9R5RWDHK9V2T']/descendant::a[@class='s1Q9rs']"));
		firstproduct.click();
		Set<String> win = driver.getWindowHandles();
		for (String child:win) {
			driver.switchTo().window(child);
		}
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		WebElement pdttx = driver.findElement(By.xpath("//div[@class='_2nQDXZ']/descendant::div[@class='_2-uG6-']/child::a[@class='_2Kn22P gBNbID' and contains(.,'DARSHANAM WORLD 220v 500w Portable Electric Heater Mini')]"));
		String pdtx1 = pdttx.getText();
		System.out.println(pdtx1);

//		Assert.assertEquals(pr1, pdtx1);

	}
}




/*

 		List<WebElement> names = driver.findElements(By.xpath("//div[@class='_13oc-S']/child::div/child::div[@class='_4ddWXP']/a[@class='s1Q9rs']"));
		int count = names.size();
		System.out.println(count);
		WebElement tap = names.get(0);
		for (int i = 0; i < names.size(); i++) {
			String text = names.get(i).getText();
			System.out.println(text+"-------->"+   + i);

		}
		tap.click();

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();

 */

