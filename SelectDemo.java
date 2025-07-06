package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();		
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swathi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select src=new Select(source);
		src.selectByIndex(4);
		WebElement mc=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mcs=new Select(mc);
		mcs.selectByVisibleText("Automobile");
		WebElement os=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select oss=new Select(os);
		oss.selectByValue("OWN_SCORP");
		driver.findElement(By.name("submitButton")).click();
	}

}
