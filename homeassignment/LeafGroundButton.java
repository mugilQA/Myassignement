package week2.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
		String str = driver.getTitle();
		System.out.println(str);
		driver.navigate().back();
		boolean value = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled();
		String str1 = String.valueOf(value);
		System.out.println(str1);
		Point str2 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).getLocation();
		System.out.println(str2);
		String str3 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("background-color");
		System.out.println(str3);
		Dimension str4 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize();
		System.out.println(str4);
		driver.quit();

	}

}
