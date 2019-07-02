package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPOM {
	private WebDriver driver;
	
	public AddUserPOM(WebDriver driver) 
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="firstname")
	private WebElement FirstName;
	
	public void addFirstName(String FName)
	{
	this.FirstName.sendKeys(FName);
	}
	
	@FindBy(id="lastname")
	private WebElement LastName;
	
	public void addLastName(String LName)
	{
	this.LastName.sendKeys(LName);
	}
	
	
	@FindBy(id="email")
	private WebElement EmailID;
	
	public void addEmailID(String MailId)
	{
		this.EmailID.sendKeys(MailId);
		
	}
		
	@FindBy(id="phone")
	private WebElement PhoneNo;
	
	public void addPhoneNo(String phno)
	{
		this.PhoneNo.sendKeys(phno);
		
	}
	
	
	@FindBy(id="username")
	private WebElement LoginTextBox;
	
	public void addLoginTextBox(String msg)
	{
		this.LoginTextBox.sendKeys(msg);
	
		
	}
	
	@FindBy(name="password[password_auto]")
	private WebElement EnterPassword;
	
	public void clickEnterPassword()
	{
		this.EnterPassword.click();
	}
	
	@FindBy(id="password")
	private WebElement PasswordTextBox;
	
	public void addPasswordTextBox(String pwd)
	{
		this.PasswordTextBox.sendKeys(pwd);
		
	}
	
	@FindBy(xpath="//div[@class='filter-option-inner']")
	private WebElement Profile;
	
	public void clickProfile()
	{
		Actions act = new Actions(driver);
		act.moveToElement(this.Profile).click().build().perform();
		
		
	}
	@FindBy(xpath="//a//span[contains(text(),'Trainer')]")
	private WebElement Trainer;
	
	public void clickTrainer()
	{
		Actions act1 = new Actions(driver);
		act1.moveToElement(this.Trainer).click().build().perform();
	}
	@FindBy(name="submit")
     private WebElement AddButton;
	
	public void clickAddButton()
	{
		this.AddButton.click();
		
	}
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	
	 private WebElement SuccessMsg;
	
	public String validatemsg()
	{
		return this.SuccessMsg.getText();
	}
			
	}
	
	
	
	
	
	
	

