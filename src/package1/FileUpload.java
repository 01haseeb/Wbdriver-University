package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\6 - CLASS ROOM\\Software Testing\\Download Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		driver.manage().window().maximize();
		WebElement fileupload=driver.findElement(By.id("myFile"));
		fileupload.sendKeys("E://5 - PHOTO'S//DOWNLOADS//black-wallpaper-3.jpg");
		WebElement submitbtn = driver.findElement(By.id("submit-button"));
		submitbtn.click();

	}

}
