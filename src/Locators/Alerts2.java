package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.redbus.com/");
	
	
	
	//syntax for authentication PopUp
	// http://user:password@URl //in between give user name and password then url
	//ex= https://@the-internet.herokuapp.com/basic_auth    //admin is user name and password admin
	//ex= https://admin:admin@the-internet.herokuapp.com/basic_auth
}
}
