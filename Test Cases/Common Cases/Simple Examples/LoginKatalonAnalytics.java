package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginKatalonAnalytics {
	
  public static void main(String[] args) {

	// Invoke Browser and Navigate to Katalon Analytics
    System.setProperty("webdriver.chrome.driver","E:\\Katalon\\Katalon Build\\Katalon_Studio_Windows_64-5.10.0\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    	
    String baseUrl = "https://analytics.katalon.com/index.html";
    String expectedTitle = "Katalon Analytics (Beta)";
    String actualTitle = "";

    driver.get(baseUrl);
      
    //Enter the value of username
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demo.kmssolutions@gmail.com");
        
    //Enter the value of password
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@123");

    //Click on Login Button
    driver.findElement(By.xpath("//button[@type='submit']")).click();
        
    //Get the actual value of the title
    actualTitle = driver.getTitle();

    /*
     * compare the actual title of the page with the expected one and print
     * the result as "Passed" or "Failed"
     */
    if (actualTitle.contentEquals(expectedTitle)){
        System.out.println("Test Passed!");
    } else {
        System.out.println("Test Failed");
    }
    
    //close Chrome
    driver.close();
       
  }
}
