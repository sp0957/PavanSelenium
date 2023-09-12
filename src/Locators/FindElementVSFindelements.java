package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElementVSFindelements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://mridulmadhok.in/");
	    
	    
	  //findElements= return multiple web element 
	   List<WebElement> links=driver.findElements(By.tagName("a"));
	   System.out.println(links.size());
//	   for (WebElement  ele : link) {
//		System.out.println(ele);
//	}
	   
	   ////findElement=return single element
	   WebElement link=driver.findElement(By.linkText("Activated charcoal"));
	   link.click();
	   Thread.sleep(2000);
	  
	   
	}
}
