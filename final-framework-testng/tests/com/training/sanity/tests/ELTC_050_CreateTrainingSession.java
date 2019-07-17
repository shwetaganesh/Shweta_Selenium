package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AddTraining;
import com.training.pom.AdminHomePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_050_CreateTrainingSession {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test(priority=1)
	public void validLoginTest() {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
	}
	
	@Test(priority=2)
	public void editUser() 
	
	{
		AdminHomePOM adminHome = new AdminHomePOM(driver);
		adminHome.clickAdminTab();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);	
		
	}
	
	@Test(priority=3)
	
	public void addTrainingSession()
	{
		AddTraining createtraining = new AddTraining(driver);
		createtraining.clickAdminTab();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		createtraining.clickTrngSession();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		createtraining.entersession("Gift from all the Goddess to Saumya");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		createtraining.clickNextStep();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		createtraining.clickSelectCourse();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		createtraining.clickRightButton();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		createtraining.clickNext();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		createtraining.editUserBox("shrivastava");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		createtraining.clickLink();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		createtraining.clickFinishButton();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				
	}

}
