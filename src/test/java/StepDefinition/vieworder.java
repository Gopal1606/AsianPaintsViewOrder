package StepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import AsianPaintsPOM.ViewOrderPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class vieworder {
	WebDriver driver;
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
	     driver = new ChromeDriver();
	    driver.get("https://www.asianpaints.com/");
	 
	    driver.manage().window().maximize();
	}

	@When("User Navigate to Profile icon")
	public void user_navigate_to_profile_icon() {
		 ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		 orderpage.clickprofile();

	}

	@When("Click on login")
	public void click_on_login() {
		 ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		orderpage.clickloginbtn();
	}

	@When("Enter the phone number")
	public void enter_the_phone_number() {
		 ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		 orderpage.enterno("8610425963");
	}

	@When("Click on submit")
	public void click_on_submit() throws InterruptedException {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		  orderpage.numbersubmit();
		    Thread.sleep(20000);
	}

	@When("Click on submit otp")
	public void click_on_submit_otp() throws InterruptedException {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		 orderpage.otpsubmit();
		 Thread.sleep(10000);
	}

	@When("Click on profile icon")
	public void click_on_profile_icon() {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		orderpage.clickprofile1();
	}

	@When("Click on my profile")
	public void click_on_my_profile() {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		 orderpage.clickmyprofile();
	}

	@When("Click on my order tab")
	public void click_on_my_order_tab() {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		 orderpage.clickmyorder();
	}

	@When("User cant able to view ordered items")
	public void user_cant_able_to_view_ordered_items() {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		   orderpage.clickprofile2();
	}

	@When("Click on signout")
	public void click_on_signout() {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		orderpage.signout();
	}

	@Then("User should view home page")
	public void user_should_view_home_page() {
	    driver.close();
	}

}
