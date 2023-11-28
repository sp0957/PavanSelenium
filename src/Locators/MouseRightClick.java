package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://swisnl.github.io/jQuery-contextMenu//demo.html");
	
     WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
     Actions action=new Actions(driver);
     action.contextClick(button).perform();
    
}
}
