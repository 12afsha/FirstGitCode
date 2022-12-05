package FirstMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
@FindBy(xpath="//input[@id='email']")
WebElement email;
@FindBy(xpath="//input[@name='pass']")
WebElement pass;
@FindBy(xpath="//button[@name='login']")
WebElement login;
@FindBy(xpath="//a[normalize-space()='Forgotten password?']")
WebElement ForgotPassword;
@FindBy(xpath="//a[text()='Create New Account']")
WebElement CreateNewAccount;
WebDriver driver;

public LoginPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void setEmail(String username)
{
	email.clear();
	email.sendKeys(username);
}

public void setPass(String password)
{
	pass.clear();
	pass.sendKeys(password);
}

public void clickLogin() {
	login.click();
}

public void textFordwordPassword()
{
	ForgotPassword.getText();
	System.out.println(ForgotPassword);
}

public void clickForgotPass()
{
	ForgotPassword.click();
}
public void clickCreateNewAccount()
{
	CreateNewAccount.click();
}
}

