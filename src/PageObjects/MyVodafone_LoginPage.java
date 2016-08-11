package PageObjects;

import org.openqa.selenium.*;

public class MyVodafone_LoginPage {
	private static WebElement element = null;
	
	public static WebElement txtbox_Username(WebDriver driver){
		element = driver.findElement(By.xpath("//input[@id='myvfLoginOnlineId']"));
		return element;
	}
	
	public static WebElement txtbox_Password(WebDriver driver){
		element = driver.findElement(By.xpath("//input[@id='myvfLoginPassword']"));
		return element;
	}
	
	public static WebElement btn_SignIn(WebDriver driver){
		element = driver.findElement(By.xpath("//input[@id='sign-in-button']"));
		return element;
	}
}
