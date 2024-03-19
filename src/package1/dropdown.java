package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\6 - CLASS ROOM\\Software Testing\\Download Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		//DROPDOWN
//		//select value from visible text
//		Select dropdown1 = new Select(driver.findElement(By.id("dropdowm-menu-1")));
//		dropdown1.selectByVisibleText("JAVA");
//		//select value using index
//		Select dropdown2 = new Select(driver.findElement(By.id("dropdowm-menu-2")));
//		dropdown2.selectByIndex(3);
//		//select value using byvalue
//		Select dropdown3 = new Select(driver.findElement(By.id("dropdowm-menu-3")));
//		dropdown3.selectByValue("jquery");
		
		//CHECKBOX
		WebElement Checkboxe1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[3]/input"));
		Checkboxe1.click();
		Checkboxe1.clear();
		
		//Radio Button(s)
		//WebElement radio1=driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[3]"));
		//radio1.click();
		
		//elected & Disabled
		//WebElement Pumpkin = driver.findElement(By.xpath("//*[@id=\"radio-buttons-selected-disabled\"]/input[3]"));
		//Pumpkin.click();
	
		//Selected & Disabled
		//Select dropfruit = new Select(driver.findElement(By.xpath("//*[@id=\"fruit-selects\"]")));
		//dropfruit.selectByValue("pear");
		//dropfruit.selectByIndex(3);
	
		
		
	}
}
	
