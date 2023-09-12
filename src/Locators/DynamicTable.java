package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://dynamictable.com/demos/");
	
	//1.how many row in table 
    List<WebElement> row=driver.findElements(By.xpath("//table[@id='dynamicTable']//thead//th"));
   // System.out.println(row);
    
   //2.how many column in table
    List<WebElement> column=driver.findElements(By.xpath("//table[@id='dynamicTable']//tbody//td"));
    //System.out.println(column);
    
    //3.Retrieve data from specific row and column  
    for (int i = 1; i <=row.size(); i++) {
		for (int j = 1; j <=column.size(); j++) {
		String data=driver.findElement(By.xpath("//table[@id='dynamicTable']//tr["+i+"]//td["+j+"]")).getText();
		System.out.print("       |        "+data);
		}
		System.out.println();
		Thread.sleep(1000);
	}
}
}
