package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\6 - CLASS ROOM\\Software Testing\\Download Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		
		//DRAG AND DROP
//		driver.switchTo().frame(0);
//		WebElement sourceElement = driver.findElement(By.id("draggable"));
//		WebElement targetElement = driver.findElement(By.id("droppable"));			
		Actions ac= new Actions(driver);
//		ac.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();

		//DOUBLE CLICK
//		Actions ac = new Actions(driver);
//		WebElement dubleclick = driver.findElement(By.cssSelector("#double-click > h2"))
//		ac.doubleClick(dubleclick).perform();
		
		//hold and click
		WebElement holdclick=driver.findElement(By.id("click-box"));
		ac.clickAndHold(holdclick).buid().perform();
				
		
	}

}
