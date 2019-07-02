package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePOM {
private WebDriver driver; 
	
	public AdminHomePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Administration")
	private WebElement AdminTab;
	
	public void clickAdminTab()
	{
		this.AdminTab.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'Add a user')]")
	private WebElement AddUser;
	
	public void clickAddUser()
	{
		this.AddUser.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'User list')]")
	private WebElement UserList;
	
	public void clickUserList()
	{
		this.UserList.click();
	}
	
	@FindBy(xpath="//table//tbody//tr[2]//td[11]//a[5]//img")
	private WebElement EditIcon;
	
	public void clickEditIcon()
	{
		this.EditIcon.click();
	}
	

}
