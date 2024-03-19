package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\6 - CLASS ROOM\\Software Testing\\Download Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		driver.manage().window().maximize();
		
		//username
		WebElement username = driver.findElement(By.xpath("//*[@id=\"text\"]"));
		username.sendKeys("haseeb");
		
		//password
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("123456");
		
		//login
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		login.click();
	}

}
