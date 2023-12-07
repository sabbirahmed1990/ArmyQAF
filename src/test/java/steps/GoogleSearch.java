package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import common.ArmyQABaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Homepage;

public class GoogleSearch extends ArmyQABaseClass {
	
	Homepage aqf1;
	//WebDriver driver;
	
	@Given("I am on google homepage")
	public void i_am_on_google_homepage() {
		
		lauchBrowser();
		
		
	}   

	@When("I enter {string} on the search box")
	public void i_enter_on_the_search_box(String string) {
		
		//identity the element
		//8 locators -- id, name, 
		//link text and partial link text = for link
		// html tag = for All link Element same page start with <a 
		//class name 
		// xpath = 1. Absolute xpath is one / ( location dependent and we don't use that much ) 
		//         2. relative xpath is two // ( location dependent and we alaways use )
		
		//css seleector 
		
		// perfor the action
		
	    aqf1 = new Homepage(driver);
		aqf1.enterSearch(string);
	   
	}

	@When("I click search button")
	public void i_click_search_button() {
	   
		
		aqf1.clickSearch();
		
		
	}

	@Then("I fine relevent result")
	public void i_fine_relevent_result() {
		
		String title = driver.getTitle();
		System.out.println("**********************");
		System.out.println(title);
		System.out.println("***********************");
		
		Assert.assertEquals(title, "QA jobs in NY - Google Search" );
		
		
		
		
		
		
		WebElement searchresulttest = driver.findElement(By.id("result-stats"));
		String result = searchresulttest.getText();
		System.out.println("**********************");
		System.out.println(result);
		System.out.println("***********************");
		
		
		
		closebrowser();
		
		
		
	    
	}



}
