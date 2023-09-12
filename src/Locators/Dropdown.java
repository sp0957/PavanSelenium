package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://formstone.it/components/dropdown/demo/");

	WebElement label = driver.findElement(By.name("demo_basic"));
	Select select = new Select(label);
	// select.selectByIndex(0);
	// select.selectByValue("2");
	// select.selectByVisibleText("Two");
		
		
    //select option from drop down without using method 
	List<WebElement>alloption=select.getOptions();
	for (WebElement option : alloption) {
		if (option.getText().equals("One")) {
			option.click();
			break;
		}
	}
	}
}
