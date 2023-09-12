package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BootstrapDemo3 {
	
	public static void main(String[] args) throws InterruptedException {
		

		
		        // Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");

		        // Create a new instance of ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the website
		        driver.get("https://bstackdemo.com/signin");
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"username\"]/div/div[1]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//div[text()='fav_user']")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"password\"]/div/div[1]/div[1]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		        
		        
		        
		        
	}
}
