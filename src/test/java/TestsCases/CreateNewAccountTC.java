package TestsCases;


import java.io.IOException;

//2-3 year no ask for framwork---coding standard


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FirstMavenProject.BaseTest;
import FirstMavenProject.LoginPage;


public class CreateNewAccountTC extends BaseTest {	

	public CreateNewAccountTC() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	public WebDriver driver;
	public LoginPage lp;

	@BeforeMethod
	public void setup() throws InterruptedException {
		driver=setUpBrowser();
	lp = new LoginPage(driver);
	
	}


	@Test
	public void createNewButton() throws InterruptedException {
		lp.clickCreateNewAccount();
		Thread.sleep(3000);
	}
	@AfterMethod
	public void teardown() 
	{
		tearDown1();
		
	}
}
