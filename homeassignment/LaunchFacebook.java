package week2.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchFacebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("QA");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8425656789");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("ThiyaSakthi@10");
		WebElement sel = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select aa1 = new Select(sel);
		aa1.selectByValue("18");
		WebElement sel2 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select aa2 = new Select(sel2);
		aa2.selectByValue("8");
		WebElement sel3 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select aa3 = new Select(sel3);
		aa3.selectByIndex(31);
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
