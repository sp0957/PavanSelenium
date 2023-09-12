package Locators;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.formify.pro/");
	Thread.sleep(2000);
	
	//capture link from a webpage
    List<WebElement> links=driver.findElements(By.tagName("a"));

    // number link
    System.out.println(links.size());
      
    
      for (int i = 0; i < links.size(); i++) {
		
    	//by using href attribute we can get URL of required link
    	WebElement element=links.get(i);
    	String url=element.getAttribute("href");
    	
    	URL link=new URL(url);
    	
    	//create a connection using url object 'link'
    	 HttpURLConnection httpURLConnection=(HttpURLConnection) link.openConnection();
      	Thread.sleep(1000);
    	//establish connection
    	httpURLConnection.connect();
    	
    	int rescode=httpURLConnection.getResponseCode();//Return response code. if res code is above 400 :broken link
    	
    	if (rescode>=400) 
    	{
			System.out.println(url + "-"+"is broken link");
		}
    	else 
    	{
    		System.out.println(url + "-"+"is valid link");
		}
	}
    
}
}
