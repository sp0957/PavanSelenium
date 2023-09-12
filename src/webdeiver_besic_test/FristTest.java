package webdeiver_besic_test;
/*
 * chrome
 *  System.setProperty("webdriver.chrome.driver")
 * FF
 *  System.setProperty("webdriver.Firefox.marionette" 
 *  
 *   WebDriver driver=new ChromeDriver();
 *   WebDriver driver=new FirefoxDriver();
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FristTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver(); //invoke the browser 
      
      driver.get("https://demo.guru99.com/selenium/newtours/"); // open URL in the browser 
      driver.manage().window().maximize();// maximize the browser window 
      driver.findElement(By.name("userName")).sendKeys("Mercury");// enter username 
      Thread.sleep(1000);
      driver.findElement(By.name("password")).sendKeys("Mercury");//enter password 
      Thread.sleep(1000);
      driver.findElement(By.name("Sign-In")).click(); //click signing button 
      
      
//      String exptitle="Login: Mercury Tours";
//      String actitle=driver.getTitle();
//      
//      if (exptitle.equals(actitle)==true) {
//		System.out.println("Testcase is pass");
//	  } 
//      else {
//		System.out.println("Testcase is Failed");
//	}
//       
      driver.close();
	}

}
