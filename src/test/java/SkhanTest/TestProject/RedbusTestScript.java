package SkhanTest.TestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import SkhanTest.TestProject.*;
public class RedbusTestScript
{
	RedbusHomeTest RB = new RedbusHomeTest();
	WebDriver driver = new FirefoxDriver();
	@BeforeClass
	public void SetUp()
	{
		driver.get("http://www.redbus.in/");
	}
	@Test
	public void Redbus()
	{
		driver.findElement(By.xpath(RB.FROM_XPATH)).sendKeys("PUNE");
		driver.findElement(By.xpath(RB.TO_XPATH)).sendKeys("MUMBAI");
		driver.findElement(By.xpath(RB.DATEOFJOURNEY_XPATH)).click();
		driver.findElement(By.xpath(RB.DATE_XPATH)).click();
		driver.findElement(By.xpath(RB.SEARCHBUTTON_XPATH)).click();
	}
	@AfterTest
	public void Setdown()
	{
		driver.close();
	}
		
	
	
}
