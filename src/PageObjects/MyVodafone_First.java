package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MyVodafone_First {
		private static WebElement element = null;
		
	public static WebElement lnk_MyVodafone(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/header/div/div[5]/div/ul/li[6]"));
		return element;
	}
	
	public static WebElement txtbox_Search(WebDriver driver){
		element = driver.findElement(By.xpath("//input[@title='Search']"));
		return element;
	}
}
