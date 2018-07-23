package com.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.resources.DriverScript;

public class Project extends BaseClass{

	public Project(WebDriver driver) {
		super(driver);
	}
	
	public void iAmOnGmailLoginPage(){
		driver.navigate().to("https://accounts.google.com");
		if(DriverScript.Config.getProperty("Browser").equals("ie"))
		{
			driver.manage().window().maximize();
		}
	}
	
	public void iEnterUsername(String username){
		iWillWaitToSee(By.xpath("//input[@type='email']"));
		if(DriverScript.Config.getProperty("Browser").equals("ie"))
		{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].value='"+username+"';", driver.findElement(By.xpath("//input[@type='email']")));
		}
		else
		{
			iFillInText(driver.findElement(By.xpath("//input[@type='email']")), username);
		}		
	}
	
	public void iClickOnNextButtonAfterUsername(){
		if(DriverScript.Config.getProperty("Browser").equals("ie"))
		{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[text()='Next']")));
		}
		else
		{
			clickElement(driver.findElement(By.xpath("//span[text()='Next']")));
		}
	}
	
	public void iEnterPasswordAndClickOnSignIn(String password) throws InterruptedException{
		Thread.sleep(4000);
		iWillWaitToSee(By.xpath("//input[@type='password']"));
		
		if(DriverScript.Config.getProperty("Browser").equals("ie"))
		{
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
			while(!(driver.findElement(By.xpath("//input[@type='password']")).getAttribute("data-initial-value").equals(password)))
			{
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Keys.CONTROL,"a");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Keys.DELETE);
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);	
			}
			if(driver.findElements(By.xpath("//span[text()='Next']")).size()>0)
			{
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[text()='Next']")));
			}
			else
			{
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[text()='Sign in']")));
			}
		}
		else
		{
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
			if(driver.findElements(By.xpath("//span[text()='Next']")).size()>0)
			{
				clickElement(driver.findElement(By.xpath("//span[text()='Next']")));
			}
			else
			{
				clickElement(driver.findElement(By.xpath("//span[text()='Sign in']")));
			}
		}
	}
	
	public void iClickOnMailIconForGmail(){
		if(DriverScript.Config.getProperty("Browser").equals("ie"))
		{
			iWillWaitToSee(By.xpath("//a[@href='https://mail.google.com']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@href='https://mail.google.com']")));
		}
		else
		{
			iWillWaitToSee(By.xpath("//a[@aria-label='Mail']"));
			clickElement(driver.findElement(By.xpath("//a[@aria-label='Mail']")));
		}
	}
	
	public void iClickOnInboxForGmail() throws InterruptedException{
		if(DriverScript.Config.getProperty("Browser").equals("ie"))
		{
			Thread.sleep(4000);
			iWillWaitToSee(By.xpath("//a[contains(text(),'Inbox')]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[contains(text(),'Inbox')]")));
			Thread.sleep(4000);
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[contains(text(),'Inbox')]")));
		}
		else
		{
			Thread.sleep(4000);
			iWillWaitToSee(By.xpath("//a[contains(text(),'Inbox')]"));
			clickElement(driver.findElement(By.xpath("//a[contains(text(),'Inbox')]")));
			Thread.sleep(4000);
			clickElement(driver.findElement(By.xpath("//a[contains(text(),'Inbox')]")));
		}
	}
}
