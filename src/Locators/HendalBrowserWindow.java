package Locators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HendalBrowserWindow {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.guru99.com/popup.php");
	
    String windowID =driver.getWindowHandle(); //  return id of the single browser window
//	System.out.println(windowID);
//	
     driver.findElement(By.linkText("Click Here")).click();//open the another browser window = child window
	
	// getWindowHandles
	Set<String> windowIDs=driver.getWindowHandles();
	System.out.println(windowIDs);
	
	/* // First methods= iterator ()
	 Iterator<String> it=windowIDs.iterator();
	 String parentwindow=it.next();
	 String childwindow=it.next();
	 System.out.println("parent window ID is "+parentwindow);
	 System.out.println("child window ID is "+childwindow); */
	 
	// Second method - using List/Arraylist 
	 List<String> windowIDlist=new ArrayList(windowIDs);
	 
	 String parentwindow=windowIDlist.get(0);
	 String childwindow=windowIDlist.get(1);
	
	 System.out.println("parent window ID is "+parentwindow);
	 System.out.println("child window ID is "+childwindow);
	
	// how to use window ID's for switching 
	 
	 driver.switchTo().window(parentwindow);
	 System.out.println(" parent window title is .."+driver.getTitle());
	 driver.switchTo().window(childwindow);
	 System.out.println(" parent window title is .."+driver.getTitle()); 
	 
	 
	 //for Each loop 
	 for (String winid : windowIDlist) {
		//System.out.println(winid);
		 String titel=driver.switchTo().window(winid).getTitle();
		 System.out.println(titel);
		
	}
	 
	// driver.close(); //close singel window 
	 driver.quit();
}
}
