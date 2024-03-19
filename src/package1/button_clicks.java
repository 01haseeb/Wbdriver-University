package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class button_clicks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\6 - CLASS ROOM\\Software Testing\\Download Software\\chromedriver-win64\\chromedriver.exe");
		// Create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();
		//Navigate to the webdriveruniversity page using GET method
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		driver.manage().window().maximize();
		
		//WebElement clickme = driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
		//clickme.click();
		
//Using JavaScript to click an element
//WebElement clickme2 = (WebElement) ((JavascriptExecutor) driver).executeScript("return document.querySelector('#button2');");
//((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickme2);
		
		//Action Move & Click
		WebElement actionclick = driver.findElement(By.id("button3"));
		// Creating an Actions object
		Actions actions = new Actions(driver);
		// Moving to the element and performing a click
		actions.moveToElement(actionclick).click().perform();

	}

}
