package IccScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario5 {
	@Test
	public void scenario5() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.tutorialsninja.com/demo/");
		String title = driver.getTitle();
		System.out.println(title);
		Actions action=new Actions(driver);
		
		WebElement components = driver.findElement(By.xpath("//a[@class='dropdown-toggle' and contains(.,'Components')]"));
		action.clickAndHold(components).perform();
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle' and contains(.,'Components')]/following-sibling::div/descendant::li/a[contains(.,'Monitors')]")).click();	
//		driver.findElement(By.xpath("//a[@class='dropdown-toggle' and contains(.,'Components')]/following-sibling::div/descendant::li/a[contains(@href,'http://tutorialsninja.com/demo/index.php?route=product/category&path=25_28') ]")).click();
		
		
		
		
		
		
	}
	
}
