package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://careercenter.tops-int.com/");
    
     //Absolute  Xpath
    //driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/form/div[1]/input")).sendKeys("1234568744");
    //driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/form/div[2]/input")).sendKeys("23423433432");
	    
	//Reletive xpath
    //driver.findElement(By.xpath("//*[@name='user_name']")).sendKeys("12345676543");
    //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456787");
		
	//X path With     OR         (Atlist one attribute will be match )
    //driver.findElement(By.xpath("//*[@name='user_name' or @ id='mobile']")).sendKeys("4565467");
	//driver.findElement(By.xpath("//*[@name='user_password' or @ id='password']")).sendKeys("54344455");	
	 
    //X path With     And        (Both attribute will be match otherwise give error)
    //driver.findElement(By.xpath("//*[@name='user_name' and @ id='mobile']")).sendKeys("4565467");
    //driver.findElement(By.xpath("//*[@name='user_password' and @id='password']")).sendKeys("4565467");
    
    //X path With    contain()   (no need to pass complete values give some match element)
    //driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("2345676543"); //name="user_name"
    //driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("4345445434545"); //id="password"
    
    //X path with starts-with()   (in this case staring point of the values and match with original values should match then it work)
    //driver.findElement(By.xpath("//input[starts-with(@id,'mobi')]")).sendKeys("2345676543"); //id="mobile"
    //driver.findElement(By.xpath("//input[starts-with(@id,'pas')]")).sendKeys("4345445434545"); //id="pas"
    
    //X with text() 
    // driver.findElement(By.xpath("//a[text()='name']
    
    
    
    
    
    
	}
}
