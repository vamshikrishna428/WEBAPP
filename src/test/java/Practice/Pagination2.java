package Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement scroll = driver.findElement(By.xpath("//div[@id='example_wrapper']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(true);", scroll);

		List<WebElement> namesElements = driver
				.findElements(By.xpath("//table[@id='example']/descendant::tbody/tr/td[1]"));

		List<String> names = new ArrayList<String>();

		for (WebElement namesElement : namesElements) {
			names.add(namesElement.getText());
		}
		String nextButtonClass = driver.findElement(By.id("example_next")).getAttribute("class");

		while (!nextButtonClass.contains("disabled")) {
			driver.findElement(By.id("example_next")).click();
			namesElements = driver.findElements(By.xpath("//table[@id='example']/descendant::tbody/tr/td[1]"));
			for (WebElement namesElement : namesElements) {
				names.add(namesElement.getText());
			}
		}
		nextButtonClass = driver.findElement(By.id("example_next")).getAttribute("class");
		for (String name : names) {
			System.out.println(name);
		}

	}
}
