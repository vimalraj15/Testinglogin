package hi.methods;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login
{       
	
	public static WebDriver driver;
	public String test(String username ,String password)
	{   
		 System.setProperty("webdriver.chrome.driver","D:\\hello\\chromedriver.exe");	
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.get("http://localhost:8080/");
	 
	     driver.findElement(By.xpath("/html/body/form/div[3]/input")).sendKeys(username);
	     driver.findElement(By.xpath("/html/body/form/div[4]/input")).sendKeys(password);
	 
	     driver.findElement(By.xpath("/html/body/form/div[5]/button")).click();
	    
	    
	    /*
	     String h =driver.findElement(By.xpath("/html/body/h1")).getText();
	     
	     if(h.equals("Login Sucessfull"))
	     {
	    	 return "Able to login"; 
	     }*/
	     
	     
	     String h2 = driver.findElement(By.xpath("/html/body/form/div[2]")).getText(); 
	     if(h2.equals("Invalid Username or Password...please check"))
	     {
	    	 return "not able to login";
	     }
	     
	     
	     
	     
	     
	     
	     
	     
		return null;
	}
}        
