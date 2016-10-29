package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MyVodafone_First {
		private static WebElement element = null;
		
	public static WebElement lnk_MyVodafone(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='menu']/li[6]/a"));
		return element;
	}
	
}
