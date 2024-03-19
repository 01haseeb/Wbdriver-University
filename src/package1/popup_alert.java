package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_alert {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\6 - CLASS ROOM\\Software Testing\\Download Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		driver.manage().window().maximize();

//		// Click on the button that triggers an alert
//		WebElement JavaScriptAlert = driver.findElement(By.id("button1"));
//		JavaScriptAlert.click();
//		//Click on the OK button of the alert
//		driver.switchTo().alert().accept();
		
//		WebElement ModalPopup = driver.findElement(By.id("button2"));
//		ModalPopup.click();
//		//Cancel button is clicked in the alert box
//		driver.switchTo().alert().dismiss();
		
		WebElement AjaxLoader = driver.findElement(By.id("button3"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		AjaxLoader.click();
		WebElement AjaxLoaderClick = driver.findElement(By.id("myDiv"));
		AjaxLoaderClick.click();
		
//		WebElement JavaScriptConfirmBox = driver.findElement(By.id("button4"));
//		JavaScriptConfirmBox.click();
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();

	}

}
