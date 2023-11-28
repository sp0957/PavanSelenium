package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class AUTO_SUGGEST {
	public void name() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(2000);
		driver.findElement(By.id("autosuggest")).sendKeys("API");
		Thread.sleep(2000);
		 List<WebElement> list=  driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		  int count= list.size();
		 list.get(count-2).click();
		 Thread.sleep(2000);
		
		
		
	}
	
	public void name1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(2000);
		driver.findElement(By.id("autosuggest")).sendKeys("API");
		Thread.sleep(2000);
		 List<WebElement> list=  driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		  for (WebElement webElement : list) {
			  if (webElement.getText().equals("RestAssured API Automation")) {
				webElement.click();
			}	
		}	
	}


}
