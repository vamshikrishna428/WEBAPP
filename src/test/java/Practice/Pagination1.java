package Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement scroll = driver.findElement(By.xpath("//div[@id='example_wrapper']"));
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true);",scroll);

		List<WebElement> page = driver.findElements(By.xpath("//div[@id='example_paginate']/descendant::span/child::a"));
		System.out.println("No Of Pages---> " +page.size());

		List<String>names=new ArrayList<String>();
		for (int i=1; i<=page.size(); i++) 
		{
			WebElement pl = driver.findElement(By.xpath("//div[@id='example_paginate']/descendant::span/child::a["+i+"]"));
			pl.click();
			List<WebElement> namesElements = driver.findElements(By.xpath("//table[@id='example']/descendant::tbody/tr/td[1]"));
			for(WebElement nameElement:namesElements) {
				names.add(nameElement.getText());
			}
		}
		for(String name:names) {
			System.out.println(name);
		}
		Thread.sleep(3000);
		driver.quit();
	}
}

