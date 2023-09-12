package WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\sahil learn\\Automation testing\\Sahilselenium\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();  
      
     driver.get("https://demo.guru99.com/selenium/newtours/"); 
     System.out.println(driver.getTitle());
     Thread.sleep(1000);
     
     driver.navigate().to("https://www.facebook.com/");
     System.out.println(driver.getTitle());
     Thread.sleep(1000);
     
     driver.navigate().back();
     System.out.println(driver.getTitle());
     Thread.sleep(1000);
    
     driver.navigate().forward();
     System.out.println(driver.getTitle());
     Thread.sleep(1000);
//     driver.navigate().refresh(); refresh the page
     
     driver.close();
     
     
}
}
