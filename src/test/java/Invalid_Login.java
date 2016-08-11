package test.java;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Invalid_Login {
	public static WebDriver driver = null;
	public static void main(String[] args) {
		
			// Create a new instance of the Firefox driver
			driver = new FirefoxDriver();
				
		    // Launch the Vodafone Website
			driver.get("http://www.vodafone.co.nz/");
			
			// Maximize the window
			driver.manage().window().maximize();
			
			// Wait for synchronization
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			// Click on "My Vodafone"
			driver.findElement(By.xpath("/html/body/header/div/div[5]/div/ul/li[6]")).click();
			driver.findElement(By.xpath("//input[@title='Search']")).click();
			
			// Click on Login
			driver.findElement(By.xpath("//a[@title='Login']")).click();
			
			// Enter Invalid Username
			driver.findElement(By.xpath("//input[@id='myvfLoginOnlineId']")).sendKeys("wertfd");
			
			// Enter Invalid Password
			driver.findElement(By.xpath("//input[@id='myvfLoginPassword']")).sendKeys("fhduhi");
			
			// Click on Sign in
			driver.findElement(By.xpath("//input[@id='sign-in-button']")).click();
			
			// Capture the error message
			String error_msg = driver.findElement(By.xpath("//div[@class='submitError']")).getText();
			if(error_msg != null)
			{
				System.out.println(error_msg);
			}
			else
			{
				System.out.println("Login Successful");
			}
				
		    // Close the driver
		    driver.quit();

	}

}
