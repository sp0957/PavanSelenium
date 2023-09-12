package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommand {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\sahil learn\\Automation testing\\Sahilselenium\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();  
	      
	      driver.get("https://demo.guru99.com/selenium/newtours/"); 
	      
	      System.out.println(driver.getTitle());//return title of the page
	      
	      System.out.println(driver.getCurrentUrl());//return the URL of the page
	    
	      
	      // use getText() like Jul 6, 2017 this element present in this page or not 
	    String text =driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")).getText();
	     System.out.println(text); 
	     
	     driver.close();
	}

}
