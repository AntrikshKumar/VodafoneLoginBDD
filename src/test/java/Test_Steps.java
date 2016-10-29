package test.java;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import PageObjects.MyVodafone_First;
import PageObjects.MyVodafone_LoginPage;
import PageObjects.MyVodafone_Second;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	
	public static WebDriver driver = new FirefoxDriver();
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
			driver.get("http://www.vodafone.co.nz/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	
	@When("^User clicks on My Vodafone$")
	public void user_clicks_on_My_Vodafone() throws Throwable {
		MyVodafone_First.lnk_MyVodafone(driver).click();
		}
	
	@When("^User clicks 'Login' on 'http://www.vodafone.co.nz/using-myvodafone/' Page$")
	public void user_clicks_Login() throws Throwable {
		MyVodafone_Second.Btn_Login(driver).click();
		}
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_Invalid_UserName_and_Password(String username, String password) 
			throws Throwable {
		MyVodafone_LoginPage.txtbox_Username(driver).sendKeys(username);
		MyVodafone_LoginPage.txtbox_Password(driver).sendKeys(password);
		MyVodafone_LoginPage.btn_SignIn(driver).click();
		}
	
	@Then("^Error message is displayed$")
	public void Error_message_is_displayed(String arg1) throws Throwable {
		String expected= arg1;
		String actual= driver.findElement(By.xpath("//*[@id='loginHandler']/label")).getText();
		org.junit.Assert.assertEquals("Error message is not same",expected,actual);

	}
	@After
	public static void tearDown(){
		driver.quit();
	}
}
