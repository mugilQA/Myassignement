package week2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Mugila");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement sdd = driver.findElement(By.name("industryEnumId"));
		Select aaa = new Select(sdd);
		aaa.selectByValue("IND_SOFTWARE");
		WebElement sdd1 = driver.findElement(By.name("ownershipEnumId"));
		Select aaa1 = new Select(sdd1);
		aaa1.selectByVisibleText("S-Corporation");
		WebElement sdd2 = driver.findElement(By.name("dataSourceId"));
		Select aaa2 = new Select(sdd2);
		aaa2.selectByValue("LEAD_EMPLOYEE");
		WebElement sdd3 = driver.findElement(By.id("marketingCampaignId"));
		Select aaa3 = new Select(sdd3);
		aaa3.selectByIndex(6);
		WebElement sdd4 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select aaa4 = new Select(sdd4);
		aaa4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		WebElement gett = driver.findElement(By.xpath("(//span[contains(@class,'tabletext')])[3]"));
		String value = gett.getText();
		System.out.println(value);
		driver.quit();
	}

}
