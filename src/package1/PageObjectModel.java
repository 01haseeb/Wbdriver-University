package package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectModel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\6 - CLASS ROOM\\Software Testing\\Download Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Page-Object-Model/products.html#");
		driver.manage().window().maximize();
		
		WebElement product = driver.findElement(By.id("container-product2"));
		product.click();
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();

	}

}
