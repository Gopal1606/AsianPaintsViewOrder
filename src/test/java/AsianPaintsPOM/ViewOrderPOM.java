package AsianPaintsPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewOrderPOM { 

	WebDriver driver;
	@FindBy(css=".profileIcon")
	WebElement clickprofileicon;
	@FindBy(id="loginMobile")
	WebElement clicklogin;
	@FindBy(id="loginMobile")
	WebElement enternumber;
	@FindBy(xpath="//*[@id=\"validate-mobile\"]/div[2]/button")
	WebElement clicksubmit;
	@FindBy(xpath="//*[@id=\"loginOtp\"]")
	WebElement enterotp;
	@FindBy(xpath="//*[@id=\"validate-otp\"]/div[3]/button")
	WebElement Clickotpsubmit;
	@FindBy(css=".profileIcon-active")
	WebElement clickprofileicon1;
	@FindBy(linkText="My Profile")
	WebElement myprofile;
	@FindBy(xpath="//*[@id=\"as-smart-tab\"]/li[3]/a")
	WebElement myorder;
	@FindBy(css=".profileIcon-active")
	WebElement clickprofileicon2;
	@FindBy(xpath="//*[@id=\"loginDropdown\"]/div/ul/li[3]/a/span")
	WebElement clicksignout;
	
	

	public ViewOrderPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickprofile()
	{
		clickprofileicon.click();
	}
	public void clickloginbtn()
	{
		clicklogin.click();
	}
	public void enterno(String PN)
	{
		enternumber.sendKeys(PN);
	}
	public void numbersubmit()
	{
		clicksubmit.click();
	}
	public void otpenter(String OTP)
	{
		enterotp.sendKeys(OTP);
	}
	public void otpsubmit()
	{
		Clickotpsubmit.click();
	}
	public void clickprofile1()
	{
		clickprofileicon1.click();
	}
	public void clickmyprofile()
	{
		myprofile.click();
	}
	public void clickmyorder()
	{
		myorder.click();
	}
	public void clickprofile2()
	{
		clickprofileicon2.click();
	}
	public void signout()
	{
		clicksignout.click();
	}
}
