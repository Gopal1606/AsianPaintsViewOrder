package StepDefinition;


import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AsianPaintsPOM.ViewOrderPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class vieworder {
	
	WebDriver driver;
	@BeforeTest
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
	     driver = new ChromeDriver();
	    driver.get("https://www.asianpaints.com/");
	 
	    driver.manage().window().maximize();
	}
    @Test(priority =1)
	@When("^User Navigate to Profile icon$")
	public void user_Navigate_to_Profile_icon() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		 orderpage.clickprofile();
	}
    @Test(priority =2)
	@When("^Click on login$")
	public void click_on_login() throws Throwable {
		 ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
			orderpage.clickloginbtn();
	}
    @Test(priority =3)
	@When("^Enter the phone number$")
	public void enter_the_phone_number() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		 orderpage.enterno("8610425963");
	}
	 @Test(priority =4)
	@When("^Click on submit$")
	public void click_on_submit() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		  orderpage.numbersubmit();
		    Thread.sleep(20000);
	}
	 @Test(priority =5)
	@When("^Click on submit otp$")
	public void click_on_submit_otp() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		 orderpage.otpsubmit();
		 Thread.sleep(10000);
	}
	 @Test(priority =6)
	@When("^Click on profile icon$")
	public void click_on_profile_icon() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		orderpage.clickprofile1();
	}
	 @Test(priority =7)
	@When("^Click on my profile$")
	public void click_on_my_profile() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		 orderpage.clickmyprofile();
	}
	 @Test(priority =8)
	@When("^Click on my order tab$")
	public void click_on_my_order_tab() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		 orderpage.clickmyorder();
	}
	 @Test(priority =9)
	@When("^User cant able to view ordered items$")
	public void user_cant_able_to_view_ordered_items() throws Throwable {
		 ViewOrderPOM empty = PageFactory.initElements(driver,ViewOrderPOM.class);
		//boolean view =driver.findElement(By.xpath("//*[@id=\"emptyOrderTab\"]/div/div")).isDisplayed();
		 boolean empty1 = empty.displayorders();
		Assert.assertTrue(empty1);
		 empty.clickprofile2();
	}
	 @Test(priority =10)
	@When("^Click on signout$")
	public void click_on_signout() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		
		orderpage.signout();
		   Thread.sleep(3000);
	}
   @AfterTest
	@Then("^User should view home page$")
	public void user_should_view_home_page() throws Throwable {
	   ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
	   orderpage.clickhomepage();
	   Thread.sleep(3000);
		  driver.close();
	    }
	

}
