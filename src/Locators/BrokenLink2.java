package Locators;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLink2 {
public static void main(String[] args) throws MalformedURLException, IOException {
	
	System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.formify.pro/");
	   SoftAssert a1=new SoftAssert();
	   List<WebElement> link= driver.findElements(By.tagName("a"));
	   
	   
	   for (int i = 0; i < link.size(); i++) {
		   WebElement ele=link.get(i);
		   String url=ele.getAttribute("href");
		   HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
		   conn.setRequestMethod("HEAD");
		   conn.connect();
		   int rescode=conn.getResponseCode();
		   System.out.println(rescode);
		   a1.assertTrue(rescode<400, "The link with Text"+ele.getText()+": is broken link");
		
	}
	   a1.assertAll();
	   
}
}
