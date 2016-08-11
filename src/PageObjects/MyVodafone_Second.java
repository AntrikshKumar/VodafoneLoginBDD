package PageObjects;

import org.openqa.selenium.*;


public class MyVodafone_Second {
	private static WebElement element = null;
	
	public static WebElement Btn_Login(WebDriver driver){
		element = driver.findElement(By.xpath("//a[@title='Login']"));
		return element;
	}
}
