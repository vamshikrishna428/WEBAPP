package IccScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario2 {		// YOUTUBE SONG 
	@Test
	public void scenario2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("search_query")).sendKeys("why this kolavari di");
		
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		driver.findElement(By.xpath("//h3[@class='title-and-badge style-scope ytd-video-renderer']/child::a[@href='/watch?v=YR12Z8f1Dh8']")).click();
		
		
	}
}
