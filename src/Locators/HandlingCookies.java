package Locators;
/*
 * Cookies are temporary file which create by the browser while the visiting the web page 
 * Cookies information  not always stander it become change  every time when you run 
 */
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookies {
  public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
	  //how to capture cookies from browser 
	  Set <Cookie>cookies=driver.manage().getCookies();
	  System.out.println("Size of cookies is...."+cookies.size());//5
	  
	  //how to print cookie from browser
	  for (Cookie cookie : cookies) {
		System.out.println(cookie.getName()+" : "+cookie.getValue());
	} 
	  
	  // how to add cookies on browser
	  Cookie cookieobj =new Cookie("MYcookies12", "1234567");
	  driver.manage().addCookie(cookieobj);
	  
	  cookies=driver.manage().getCookies();
	  System.out.println("Size of cookies is...."+cookies.size());//6
	  
	  // how delete specific cookies from browser
	  //driver.manage().deleteCookie(cookieobj);
	  driver.manage().deleteCookieNamed("MYcookies12");
	  cookies=driver.manage().getCookies();
	  System.out.println("Size of cookies is...."+cookies.size());//5
	  
	  // how delete all cookies from browser
	  driver.manage().deleteAllCookies();
	  cookies=driver.manage().getCookies();
	  System.out.println("Size of cookies is...."+cookies.size());//0
	  
}
}
