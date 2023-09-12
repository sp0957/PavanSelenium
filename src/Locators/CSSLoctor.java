package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLoctor {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
	    
	    
	   // Tag & Id         tag name is optional
	   // driver.findElement(By.cssSelector("#email")).sendKeys("sahildhorajiya1@gmail.com");
	   // driver.findElement(By.cssSelector("input#email")).sendKeys("sahildhorajiya1@gmail.com");
		
	   // Tag & class       tag name is optional
	   // driver.findElement(By.cssSelector(".inputtext")).sendKeys("saasasaaaaaa");
	   // driver.findElement(By.cssSelector("input.inputtext")).sendKeys("saasasaaaaaa");
	    
	   //Tag & Attribute  tag name is optional
	   // driver.findElement(By.cssSelector("input[id=email]")).sendKeys("234343233");
	   // driver.findElement(By.cssSelector("[id=email]")).sendKeys("234343233");
	    
	   //Tag , class & Attribute  
	   //driver.findElement(By.cssSelector("input.inputtext[id=email]")).sendKeys("67654322345");
	   //driver.findElement(By.cssSelector("input.inputtext[id=pass]")).sendKeys("632ccccxxc2345");
	    		    
	}
}
