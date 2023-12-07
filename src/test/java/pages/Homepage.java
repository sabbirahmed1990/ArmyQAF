package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//page object model--- 1. page Factory 2. without page Factory
	
	
	//WebElement searchbox = driver.findElement(By.name("q"));
	//@FindBy(name="q")
	
	@FindBy(xpath = "//textarea[@name='q']")
	WebElement searchbox;
	
	
	//searchbox.sendKeys(string);
	public void enterSearch(String string) {
		searchbox.sendKeys(string);
		
	}
	
	//WebElement searchbutton = driver .findElement(By.name("btnK"));
	//@FindBy(name="btnK")
	
	//@FindBy(xpath ="//input[@class='gNO89b']")
	
	@FindBy(css ="input[class='gNO89b']")
	WebElement searchbutton;
	
	//searchbutton.submit();
	
	public void clickSearch() {
		searchbutton.submit();
	}
	
	

}
