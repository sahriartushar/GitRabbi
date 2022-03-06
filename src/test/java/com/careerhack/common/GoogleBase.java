package com.careerhack.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleBase {
	
	public WebDriver driver;
	
	public void launchBrowser() {
		
WebDriverManager.chromedriver().setup();


		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
	}
	
	public void closeBroweser() {
		driver.close();
	}

}
