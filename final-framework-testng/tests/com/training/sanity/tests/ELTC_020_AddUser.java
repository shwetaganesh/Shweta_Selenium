package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AddUserPOM;
import com.training.pom.AdminHomePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_020_AddUser {
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
	@Test(priority=3)
	public void addUser() throws InterruptedException
	{
		AddUserPOM createuser =new AddUserPOM(driver);
		createuser.addFirstName("Saumyatraining");
		createuser.addLastName("Shrivastavatraining");
		createuser.addEmailID("shwetashri081234@gmail.com");
		createuser.addPhoneNo("9731764318");
		createuser.addLoginTextBox("saumya12345");
		createuser.addPasswordTextBox("shweta");
		createuser.clickProfile();
		Thread.sleep(3000);
		createuser.clickTrainer();
		Thread.sleep(3000);
		createuser.clickAddButton();
		
		String Expected = "The user has been added: ";
		String Actual = createuser.validatemsg();
		
		Assert.assertTrue(Actual.contains(Expected));
		
		
		
	}
	 
	
	
	
	
}
