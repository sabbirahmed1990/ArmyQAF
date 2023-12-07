package advance;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutlipleWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();	
		
		WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click();
		clickHere.click();
		clickHere.click();
		clickHere.click();
		
		
		
		String parent = driver.getWindowHandle();
		System.out.println("===============================");
		System.out.println(parent);
		System.out.println("===============================");
		
		Set<String> childs = driver.getWindowHandles();
		System.out.println("===============================");
		System.out.println(childs);
		System.out.println("===============================");
		
		//driver.switchTo().window(parent);

		}

}
