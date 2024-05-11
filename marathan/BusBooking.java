package marathan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BusBooking {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[@class='station-body col']//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[@class='station-body col']//div[text()='Bangalore']")).click();
		driver.findElement(By.xpath("(//button[@class='btn active text tertiary md active button'])[2]")).click();
		String str = driver.findElement(By.xpath("(//div[contains(@id,'service-operator-agent-name')]//h5)[1]"))
				.getText();
		System.out.println(str);
		driver.findElement(By.xpath("//span[text()='Sleeper']/parent::a")).click();
		System.out.println(driver.findElement(By.xpath("(//div[contains(@class,'text-grey')]/small)[1]")).getText());
		driver.findElement(By.xpath("(//div[contains(@id,'service-operator-select-seat')]/button)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='Tooltip-Wrapper ']//span)[4]")).click();
		driver.findElement(By.xpath("(//div[@class='container checkbox-container  md ']//label)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='container checkbox-container  md ']//label)[2]")).click();
		String str1 = driver.findElement(By.xpath("//span[text()='Seat Selected :']/span")).getText();
		System.out.println("Seat Selected :" + str1);
		String str2 = driver.findElement(By.xpath("//span[text()='Base Fare :']/span")).getText();
		System.out.println("Base Fare :" + str2);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
