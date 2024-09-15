
package AbeerSelenium;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumscript {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "C:\\Selenium Webdriver\\FirefoxDriver\\geckodriver.exe");
		
		 
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		
		//Login 
		driver.get("http://localhost/wp/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("1234");
		driver.findElement(By.id("wp-submit")).click();
		
		//WP Dark Mode Plugin is Active or not
		driver.get("http://localhost/wp/wp-admin/plugins.php");

		boolean isActive = driver.getPageSource().contains("WP Dark Mode");
		
		if (isActive) {
            System.out.println("WP Dark Mode Plugin is Active.");
        } else {
            System.out.println("WP Dark Mode Plugin is Inactive. Please activate it.");
        }
		
		//Enable Admin Dashbord
		      
		

        //end
		
		//Flooting switch style 
		//driver.get("http://localhost/wp/wp-admin/admin.php?page=wp-dark-mode#/switch?tab=floating");
		//driver.findElement(By.linkText("Customization")).click();
		//driver.findElement(By.id("floating_switch_style")).click();
		//new Select(driver.findElement(By.id("floating_switch_style"))).selectByVisibleText("Style 2");

		
	    //
		
		//driver.get("https://www.google.com");
		//System.out.println(driver.getTitle()); 
		//driver.quit(); 

	}

}
