package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ConditinalCommands {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\sahil learn\\Automation testing\\Sahilselenium\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://www.facebook.com/");
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
     Thread.sleep(5000);
//   // WebElement fristname=driver.findElement(By.name("firstname"));
    WebElement fristname=driver.findElement(By.xpath("//input[@name='firstname']"));//write manually 
    WebElement lastname=driver.findElement(By.name("lastname"));
    WebElement email=driver.findElement(By.name("reg_email__"));
    WebElement reenteremail =driver.findElement(By.name("reg_email_confirmation__"));
    WebElement pass=driver.findElement(By.name("reg_passwd__"));
  
    if (fristname.isDisplayed() && fristname.isEnabled()) {
		fristname.sendKeys("sahil");
	}
    Thread.sleep(3000);
    if (lastname.isDisplayed() && lastname.isEnabled()) {
		lastname.sendKeys("dhorajiya");
	}
    Thread.sleep(3000);
    if (email.isDisplayed() && email.isEnabled()) {
		email.sendKeys("sahildhorajiya1@gamil.com");
	}
    Thread.sleep(3000);
    if (reenteremail.isDisplayed() && reenteremail.isEnabled()) {
		reenteremail.sendKeys("sahildhorajiya1@gamil.com");
	} 
    Thread.sleep(3000);
    if (pass.isDisplayed() && pass.isEnabled()) {
		pass.sendKeys("******");
	}
    Thread.sleep(3000);
    
    
    Select day=new Select(driver.findElement(By.name("birthday_day")));
    day.selectByValue("6");
    Thread.sleep(2000);
    Select month=new Select(driver.findElement(By.name("birthday_month")));
    month.selectByIndex(10);
    Thread.sleep(2000);
    Select year=new Select(driver.findElement(By.name("birthday_year")));
    year.selectByVisibleText("2003");
    Thread.sleep(2000);
    
   
    //isSelected() give true or false  check is selected or not
    // for male
    System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).isSelected());
    
     //select male
    if (driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).isSelected()== false) {
    	driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
    	}
    Thread.sleep(2000);
    driver.close();
}
}

