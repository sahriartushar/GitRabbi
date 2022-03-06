package com.careerhack.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.careerhack.common.GoogleBase;
import com.careerhack.page.GoogleHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchNightOwl extends GoogleBase  {

	//WebDriver driver;
	
	@Given("I am on google homepage")
	public void i_am_on_google_homepage() {
		
		launchBrowser();
	    
	}

	@When("I enter a search {string} on the search box")
	public void i_enter_a_search_on_the_search_box(String string) {
		
		//Step 1: identify/ locate the element
		//id, name , linkText, Partial LinkText, html tag, class, xpath, css selector
		//WebElement searchBox = driver.findElement(By.name("q"));
		
		//step2: perform the action
		//searchBox.sendKeys(string);
		
		GoogleHomePage obj = new GoogleHomePage(driver);
		obj.searchbox(string);
	   
	}

	@When("I click on the search button")
	public void i_click_on_the_search_button() {
	    
		//WebElement searchButton = driver.findElement(By.name("btnK"));
		//searchButton.submit();

		GoogleHomePage obj = new GoogleHomePage(driver);
		obj.Searcbutton();
		
	}

	@Then("I find relevent results and count of the results")
	public void i_find_relevent_results_and_count_of_the_results() {
		
		//WebElement results = driver.findElement(By.id("result-stats"));
		//String resultCounts = results.getText();
				
		System.out.println("===========================================");
		//System.out.println(resultCounts);
		System.out.println("===========================================");
		
		
		closeBroweser();		
		
	}
	
	
}
