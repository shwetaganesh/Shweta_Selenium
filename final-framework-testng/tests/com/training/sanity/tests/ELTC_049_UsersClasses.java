package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.remote.RemoteTestNG;
import com.training.generics.ScreenShot;
import com.training.pom.AddClassPOM;
import com.training.pom.AdminHomePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_049_UsersClasses {
	
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
    public void addClassCourse() 
    {
		AddClassPOM classcourse = new AddClassPOM(driver);
		classcourse.clickClasses();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		classcourse.clickAddClass();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		classcourse.AddName("demo");
		classcourse.AddDescription("demo");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		classcourse.clickGroupPermissions();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		classcourse.clickOpen();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		classcourse.clickAddButton();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		classcourse.clickSubscribeUsers();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		classcourse.clickSelected();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		classcourse.clickInButton();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		classcourse.clickUserToClass();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		classcourse.clickClassToCourse();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		classcourse.clickSelectCourse();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		classcourse.clickInButton();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		classcourse.clickClassToCourses();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
    }
    
   
}


