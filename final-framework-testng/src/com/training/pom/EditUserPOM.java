package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditUserPOM 
{
private WebDriver driver; 
	
	public EditUserPOM(WebDriver driver)
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
	
	@FindBy(xpath="//a[contains(text(),'User list')]")
	
	private WebElement UserList;
	
	public void clickUserList()
	{
		this.UserList.click();
	}
	
	@FindBy(id="search_simple_keyword")
	
	private WebElement SearchBox;
	
	public void editSearchBox(String nm)
	{
		this.SearchBox.sendKeys(nm);
	}
	
	@FindBy(xpath="//em[@class='fa fa-search']")
	
	private WebElement SearchButton;
	
	public void clickSearchButton()
	{
		this.SearchButton.click();
		
	}
	
	@FindBy(xpath="//a//img[@title='Edit']")
	
	private WebElement EditIcon;
	
	public void clickEditIcon()
	{
		this.EditIcon.click();
	}
	
	@FindBy(id="user_edit_email")
	
	private WebElement EmailBox;
	
	public void blankEmailBox(String mail)
	{
		this.EmailBox.clear();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		this.EmailBox.sendKeys(mail);
		
	}
	
	@FindBy(id="qf_f67d69") 
	
	private WebElement InactiveButton;
	
	public void clickInactiveButton() throws InterruptedException
	
	{
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,1000)");
	    //Actions act = new Actions(driver);
	    Thread.sleep(3000);
	    System.out.println("radio operation");
	   //act.moveToElement(this.InactiveButton).click().build().perform();
	    
		 this.InactiveButton.click();
	}
			
	@FindBy(xpath="//button//em[@class='fa fa-check']")
	
	private WebElement SaveButton;
	
	public void clickSaveButton()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		this.SaveButton.click();
	}
	

}
