package marathan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBuy {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bag for Boys");
		driver.findElement(By.xpath("(//div[@class='left-pane-results-container'])[1]")).click();
		String str = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span"))
				.getText();
		String str1 = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
		System.out.println(str + str1);
		driver.findElement(By.xpath("//li[@class='a-spacing-micro']//span[contains(text(),'Sky')]")).click();
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		String str2 = driver.findElement(By.xpath("(//h2[@class='a-size-mini s-line-clamp-1']//span)[1]")).getText();
		System.out.println(str2);
		String str3 = driver.findElement(By.xpath("(//span[@class='a-price']//span[2]/span[2])[1]")).getText();
		System.out.println(str3);
		System.out.printf(driver.getTitle());
		driver.quit();

	}
}
