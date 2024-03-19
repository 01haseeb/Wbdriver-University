package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class todo_list {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\6 - CLASS ROOM\\Software Testing\\Download Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
		driver.manage().window().maximize();
		WebElement addnew=driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
		addnew.sendKeys("join new class");
		addnew.sendKeys(Keys.ENTER);

	}

}
