package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeybordAction2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://text-compare.com/");
	
    WebElement input1=	driver.findElement(By.xpath("//textarea[@id='inputText1']"));
    WebElement input2=	driver.findElement(By.xpath("//textarea[@id='inputText2']"));
    input1.sendKeys("Hello Tester");
    
    Actions actions=new Actions(driver);
    
    //CTRL+A
    actions.keyDown(Keys.CONTROL);
    actions.sendKeys("a");
    actions.keyUp(Keys.CONTROL);
    actions.perform();
    
    //CTRL+C
    actions.keyDown(Keys.CONTROL);
    actions.sendKeys("c");
    actions.keyUp(Keys.CONTROL);
    actions.perform();
    
    //TAB= Shift to input2 Box
    actions.sendKeys(Keys.TAB);
    actions.perform();
    
    //CTRL+v
    actions.keyDown(Keys.CONTROL);
    actions.sendKeys("v");
    actions.keyUp(Keys.CONTROL);
    actions.perform();
    
    
    if (input1.getAttribute("value").equals(input2.getAttribute("value"))) {
		System.out.println("Text is copied");
	}
    else {
		System.out.println(" Text is not copied");
	}
    
    
    
}
}
