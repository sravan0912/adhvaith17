package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Today {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","path");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		WebElement txtbox = driver.findElement(By.id(""));
		txtbox.sendKeys("Greens");
		
		
		
	}
	

}
