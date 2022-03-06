package com.careerhack.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

     WebDriver driver;	
      
      
	public GoogleHomePage (WebDriver driver) {
		
		this.driver = driver ;
		PageFactory.initElements(driver, this);
		
	}
	
	//WebElement searchBox = driver.findElement(By.name("q"));
	
	//step2: perform the action
	//searchBox.sendKeys(string);
      
	@FindBy(name="q")
	WebElement searchbar;
	
  public void searchbox (String string) {
	  searchbar.sendKeys(string);
  }
  

  
  //WebElement searchButton = driver.findElement(By.name("btnK"));
	//searchButton.submit();
  
  @FindBy(name="btnK")
  WebElement searchbutton;
  
  public void Searcbutton () {
	  
	  searchbutton.click();  
	  
  }
  
}
