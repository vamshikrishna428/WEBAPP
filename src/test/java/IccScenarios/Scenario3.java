package IccScenarios;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario3 {
	@Test
	public void scenario3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor jse = (JavascriptExecutor)driver;

		WebElement element = (WebElement) jse.executeScript(" return document.querySelector(\"body >ntp-app\").shadowRoot.querySelector(\"ntp-realbox\").shadowRoot.querySelector(\"input\").value='vamshikrishna';");

	}


}



/*		
		driver.get("https://www.google.com/");
		WebElement name = driver.findElement(By.xpath("//input[@name='q']"));
		name.sendKeys("mahesh babu");
		ArrayList<String> Alist = new ArrayList<String>();
		List<WebElement> sugg = driver.findElements(By.xpath("//ul[@class='G43f7e']/child::li"));
		int count = sugg.size();
		System.out.println("Total no of suggetions :  "+  count);
		Collections.sort(Alist);
		for(String allist:Alist)
		{
			System.out.println(allist);
		}
		for (int i = 0; i < sugg.size(); i++) {
			String text = sugg.get(i).getText();
			Alist.add(text);
			System.out.println(text);
		}	
		String index = sugg.get(2).getText();
		System.out.println(" <------3rd  index ----> " + index);
		driver.quit();
		}	
}
 */


