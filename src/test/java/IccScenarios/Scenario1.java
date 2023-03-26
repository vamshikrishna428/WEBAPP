package IccScenarios;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scenario1 {
	@Test
	public void scenario1() {
/*		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");

*/		
		
//		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
//		Point p=new Point(500, 500); 
//		driver.manage().window().setPosition(p); 

		driver.get("https://www.t20worldcup.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//child::li[@class='site-tabs__item theme theme-icc']/child::a")).click();
		Set<String> win = driver.getWindowHandles();
		for (String child:win) {
			driver.switchTo().window(child);
		}
		Actions action = new Actions(driver);
		
		WebElement ranks = driver.findElement(By.xpath("//nav[@class='main-navigation__desktop-list js-desktop-nav']/child::ul[@class='linked-list js-dynamic-list']/child::li[@class='linked-list__item  has-children ']/child::button[@class='linked-list__dropdown-label js-dropdown-btn' and contains(.,'Rankings')]"));
		
		action.clickAndHold(ranks).perform();
		
		driver.findElement(By.xpath("//ancestor::nav[@class='main-navigation__desktop-list js-desktop-nav']/child::ul[@class='linked-list js-dynamic-list']/child::li[@class='linked-list__item  has-children ']/descendant::li[@class='linked-list__item   'and contains(.,'Player Rankings')]")).click();
		
		driver.quit();
		
	}
	
}
