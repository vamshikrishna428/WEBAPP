package IccScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario4 {
	@Test
	public void scenario4() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='notification-frame-~10cb47553']"));

		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//a[@class='close']")).click();
		
		driver.findElement(By.xpath("//span[@class='truncate airPortName ']")).click();
		
		driver.findElement(By.xpath("//descendant::div[@class='react-autosuggest__suggestions-container react-autosuggest__suggestions-container--open']/descendant::ul/descendant::div/child::div/child::p[@class='font14 appendBottom5 blackText' and contains(.,'Hyderabad')]")).click();
		
		
	}
}
