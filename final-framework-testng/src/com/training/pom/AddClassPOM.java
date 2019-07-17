package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClassPOM {
	
	private WebDriver driver; 
	
	public AddClassPOM(WebDriver driver)
	{
	    this.driver = driver; 
		PageFactory.initElements(driver, this);

    }
	
	@FindBy(linkText="Administration")
	private WebElement AdminTab;
	
	public void clickAdminTab()
	{
		this.AdminTab.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'Classes')]")
	private WebElement Classes;
	
	public void clickClasses()
	{
		this.Classes.click();
	}
	
	@FindBy(xpath="//a[2]//img[@title='Add classes']")
	
	private WebElement AddClass;
	
	public void clickAddClass()
	{
		this.AddClass.click();
		
	}
	
	@FindBy(id="usergroup_name")
	
	private WebElement Name;
	
	public void AddName(String nm)
	{
		this.Name.sendKeys(nm);
	}
	
   @FindBy(id="usergroup_description")
	
	private WebElement Description;
	
	public void AddDescription(String desc)
	{
		this.Description.sendKeys(desc);
	}
	
    @FindBy(xpath="//div[@class='filter-option']") 
	
	private WebElement GroupPermissions;
	
	public void clickGroupPermissions()
	{
		Actions act = new Actions(driver);
		act.moveToElement(this.GroupPermissions).click().build().perform();
	}
	
	
	
	@FindBy(xpath="//a//span[contains(text(),'Open')]")
	
	private WebElement Open;
	
	public void clickOpen()
	{
		Actions act1 = new Actions(driver);
		act1.moveToElement(this.Open).click().build().perform();
	}
	
	@FindBy(id="usergroup_submit")
	
	private WebElement AddButton;
	
	public void clickAddButton()
	{
		this.AddButton.click();
	}
	
	@FindBy(xpath="//table//tr[6]//td[6]//a//img[@title='Subscribe users to class']")
	
	private WebElement SubscribeUsers;
	
	public void clickSubscribeUsers()
	{
		this.SubscribeUsers.click();
	}
	
	@FindBy(xpath="//option[contains(text(),'Site Owner')]")
	
	private WebElement Selected;
	
	public void clickSelected()
	{
		Actions act2 = new Actions(driver);
		act2.moveToElement(this.Selected).click().build().perform();
	}
	
	@FindBy(xpath="//em[@class='fa fa-arrow-right']")
	
     private WebElement InButton;
	
	public void clickInButton()
	{
		this.InButton.click();
	}
	
	@FindBy(xpath="//button[contains(text(),'Subscribe users to class')]")
	
	 private WebElement UserToClass;
	
	 public void clickUserToClass()
	 
	 {
		 this.UserToClass.click();
	 }
	 
	 @FindBy(xpath="//table//tr[6]//td[6]//a[2]//img[@title='Subscribe class to courses']")
	 
	 private WebElement ClassToCourse;
	 
	 public void clickClassToCourse()
	 
	 {
		 this.ClassToCourse.click();
	 }
	 
	 @FindBy(xpath="//table//tr[3]//td//option[@value='2']") 
	 
	 private WebElement SelectCourse;
	 
	 public void clickSelectCourse()
	 {
		 Actions act3 = new Actions(driver);
		 act3.moveToElement(this.SelectCourse).click().build().perform();
	 }
	 
	 @FindBy(xpath="//button[contains(text(),'Subscribe class to courses')]")
	 
	 private WebElement ClassToCourses;
	 
	 public void clickClassToCourses()
	 {
		 this.ClassToCourses.click();
	 }
	 	
	}


