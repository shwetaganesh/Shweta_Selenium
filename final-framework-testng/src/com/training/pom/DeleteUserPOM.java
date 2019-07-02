package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteUserPOM {
	
    private WebDriver driver;
	
	public DeleteUserPOM(WebDriver driver) 
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Course list')]")
    private WebElement CourseList;
	
	public void clickCourseList()
	{
		this.CourseList.click();
	}
	
	@FindBy(xpath="//table//tbody//tr[19]//td[8]//a[6]//img")
	private WebElement DeleteIcon;
	
	public void clickDeleteIcon()
	{
		this.DeleteIcon.click();
		
	}
	
		
	public void clickConfirmation()
	{
		Alert confirmationAlert = driver.switchTo().alert();
		confirmationAlert.accept();
		
	}
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement Assertmessage;
	
	public String Checkmsg()
	
	{
		return this.Assertmessage.getText();
	}
		

}
