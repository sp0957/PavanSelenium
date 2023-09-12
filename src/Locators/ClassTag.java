package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTag {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://mridulmadhok.in/");
    //findElements= return multiple web element 
    //findElement=return single element
    
    //Class name
    int silder= driver.findElements(By.className("images-contain")).size(); 
    System.out.println(silder);
    Thread.sleep(2000);
    
    //Tag name
   int link=driver.findElements(By.tagName("a")).size();
   System.out.println(link);
   
   
}
}
