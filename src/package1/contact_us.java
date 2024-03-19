package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contact_us {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\6 - CLASS ROOM\\Software Testing\\Download Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();

		//first name
		WebElement firstname = driver.findElement(By.name("first_name"));
		firstname.sendKeys("haseeb");
		//last name
		WebElement lastname = driver.findElement(By.name("last_name"));
		lastname.sendKeys("k");
		//email
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("haseeb@gmail.com");
		//comments
		WebElement comments = driver.findElement(By.name("message"));
		comments.sendKeys("i would like to joint your course");
		//submit
		WebElement submit = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
		submit.click();

	}

}
