package IccScenarios;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario6 {
	@Test
	public void scenario6() {
		ChromeOptions options=new ChromeOptions();
		HashMap<String, Integer> content=new HashMap<>();
		HashMap<String, Object> profile=new HashMap<>();
		HashMap<String, Object> preference=new HashMap<>();
		
		content.put("media_stream", 2);
		profile.put("managed_default_content_settings", content);
		preference.put("profile", profile);
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mictests.com/");
		
		WebElement mic = driver.findElement(By.id("mic-launcher"));
		System.out.println(mic.getText());
		
		mic.click();
		
		options.setExperimentalOption("prefs", preference);
		
		
		
		
		
		
}
}
