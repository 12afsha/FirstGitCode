package FirstMavenProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgottenPassword {

@FindBy(xpath="//input[@placeholder='Email or phone']")
WebElement email;
@FindBy(xpath="//input[@placeholder='Password']")
WebElement pass;
@FindBy(xpath="//div[@aria-label='Accessible login button']")
WebElement login;
@FindBy(xpath="//input[@id='identify_email']")
WebElement searchEmail;
@FindBy(xpath="//button[@id='did_submit']")
WebElement search;
@FindBy(xpath="//a[normalize-space()='Cancel']")
WebElement cancel;

public void identifyEmail(String emailPhone) 
{
	searchEmail.sendKeys(emailPhone);
}
public void searchEmail()
{
	search.click();
}
public void cancelEmail()
{
	cancel.click();
}
                                                +
}
