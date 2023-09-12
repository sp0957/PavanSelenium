package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]")).click();
		Thread.sleep(2000);
		 List<WebElement> ee=driver.findElements(By.xpath("//div[@x-placement='top-start']//a"));
		 System.out.println("number of option :"+ee.size());
		 for (WebElement option : ee) {
			if (option.getText().equals("Something else here")) {
				option.click();
				break;
				
			}
		}
//		 
//		 Thread.sleep(2000);
//		 driver.close();
		
		
	
	}

	}
