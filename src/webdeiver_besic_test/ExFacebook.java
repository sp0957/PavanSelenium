package webdeiver_besic_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExFacebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    
    String extitle="Facebook – log in or sign up";
    String actitle=driver.getTitle();
    
    if (extitle.equals(actitle)==true) {
		System.out.println("Test case is pass");
	}
    else {
		System.out.println("Test case is fail");
	}
    
    driver.close();
    
}
}
