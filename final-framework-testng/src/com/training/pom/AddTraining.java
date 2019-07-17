package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTraining {
private WebDriver driver; 
	
	public AddTraining(WebDriver driver)
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
	
	@FindBy(xpath="//a[contains(text(),'Add a training session')]")
	private WebElement TrngSession;
	
	public void clickTrngSession()
	
	{
		this.TrngSession.click();
	}
	
	@FindBy(id="add_session_name")
	
	private WebElement addsession;
	
	public void entersession(String session)
	
	{	
		
	this.addsession.sendKeys(session);	
	
	}
	
	@FindBy(id="add_session_submit")
	
	private WebElement NextStep;
	
	public void clickNextStep()
	{
		this.NextStep.click();
	}
	
	
	@FindBy(xpath="//option[contains(text(),'ACCOUNT (AC11)')]")
	
	private WebElement SelectCourse;
	
	public void clickSelectCourse()
	
	{
		this.SelectCourse.click();
	}
	
	@FindBy(xpath="//em[@class='fa fa-chevron-right']")
	
	private WebElement RightButton;
	
	public void clickRightButton()
	
	{
		this.RightButton.click();
		
	}
	
	@FindBy(xpath="//button[contains(text(),'Next step')]")
	
	private WebElement NextButton;
	
	public void clickNext()
	{
		this.NextButton.click();
	}
	
	@FindBy(id="user_to_add")
	
	private WebElement UserBox;
	
	public void editUserBox(String stunm)
	
	{
		this.UserBox.sendKeys(stunm);
	}
	
	@FindBy(xpath="//a[contains(text(),'Shrivastavaselenium Shwetaselenium (shweta1234)')]")
	
	private WebElement Link;
	
	public void clickLink()
	{
		this.Link.click();
	}
	
	@FindBy(xpath="//button[contains(text(),'Finish session creation')]")
	
	private WebElement FinishButton;
	
	public void clickFinishButton()
	{
		this.FinishButton.click();
	}
		

}
