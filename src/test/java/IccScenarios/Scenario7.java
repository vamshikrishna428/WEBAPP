package IccScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario7 {
	@Test
	public void scenario7() throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		Thread.sleep(3000);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().fullscreen();
		Thread.sleep(8000);
		driver.get("https://www.google.co.in/");
		Thread.sleep(8000);
		driver.quit();
	
	}
}
