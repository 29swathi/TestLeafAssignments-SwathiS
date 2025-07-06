package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookNewAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Swati");
		driver.findElement(By.name("lastname")).sendKeys("Shan");	
		WebElement dayDD= driver.findElement(By.id("day"));
		Select day=new Select(dayDD);
		day.selectByIndex(3);
		WebElement monthDD= driver.findElement(By.id("month"));
		Select month=new Select(monthDD);
		month.selectByVisibleText("Mar");
		WebElement yearDD= driver.findElement(By.id("year"));
		Select year=new Select(yearDD);
		year.selectByValue("1995");
		driver.findElement(By.xpath("(//input[@id='sex'])[1]")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("999911122");
		driver.findElement(By.id("password_step_input")).sendKeys("password");
	}

}