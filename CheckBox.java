package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[2]")).click();
		
		WebElement msg=driver.findElement(By.xpath("(//span[@class='ui-growl-title'])"));
		String verifyMsg=msg.getText();
		if(verifyMsg.contains("Checked"))
			System.out.println("Message displayed as expected");
		else
			System.out.println("Message displayed i not expected");
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Python']")).click();		
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		if(verifyMsg.contains("Checked"))
			System.out.println("Message displayed as expected for toggleswitch");
		else
			System.out.println("Message displayed i not expected for toggleswitch");
		boolean display=driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']")).isEnabled();
		if(display!=true)
			System.out.println("disabled");
		else
			System.out.println(display);
		driver.findElement(By.id("j_idt87:multiple")).click();

		driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
	}

}
