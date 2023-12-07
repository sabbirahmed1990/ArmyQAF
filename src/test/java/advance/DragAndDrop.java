package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();	
		
		WebElement d1 = driver.findElement(By.id("column-a"));
		WebElement d2 = driver.findElement(By.id("column-b"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(d1, d2).build().perform();
		
		
		
	}

}
