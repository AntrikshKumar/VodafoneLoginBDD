package test.java;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
		driver.findElement(By.xpath("/html/body/header/div/div[5]/div/ul/li[6]")).click();
		driver.findElement(By.xpath("//input[@title='Search']")).click();
		}
	
	@When("^User clicks 'Login' on 'http://www.vodafone.co.nz/using-myvodafone/' Page$")
	public void user_clicks_Login() throws Throwable {
		driver.findElement(By.xpath("//a[@title='Login']")).click();
		}
	
	@When("^User enters Invalid Username and Invalid Password$")
	public void user_enters_Invalid_UserName_and_Password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='myvfLoginOnlineId']")).sendKeys("wertfd");
		driver.findElement(By.xpath("//input[@id='myvfLoginPassword']")).sendKeys("fhduhi");
		driver.findElement(By.xpath("//input[@id='sign-in-button']")).click();
		}
	
	@Then("^Error message is displayed$")
	public void Error_message_is_displayed(String arg1) throws Throwable {
		String expected= arg1;
		String actual= driver.findElement(By.xpath("//div[@class='submitError']")).getText();
		org.junit.Assert.assertEquals("Error message is not same",expected,actual);

	}
	@After
	public static void tearDown(){
		driver.quit();
	}
}
