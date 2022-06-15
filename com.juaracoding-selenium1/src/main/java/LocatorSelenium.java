import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorSelenium {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver_win32\\chromedriver.exe");  
		  WebDriver driver=new ChromeDriver(); 
		  String url ="https://demoqa.com/";
	       driver.navigate().to(url); 
	       driver.manage().window().maximize(); 
	       driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1) > div > div.card-up")).click(); 
	       driver.findElement(By.id("item-0")).click();
	       driver.findElement(By.id("userName")).sendKeys("Test 1");
	       driver.findElement(By.id("userEmail")).sendKeys("Test1@gmail.com");
	       driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
	       driver.findElement(By.id("permanentAddress")).sendKeys("Jakarta Timur");
	       
	       JavascriptExecutor js = (JavascriptExecutor)driver;  
	       js.executeScript("scrollBy(0, 1000)");  
	       driver.findElement(By.id("submit")).click();
	       
	       driver.findElement(By.id("item-1")).click();
	       driver.findElement(By.cssSelector("#tree-node > ol > li > span > button > svg")).click();
	       driver.findElement(By.cssSelector("#tree-node > ol > li > span > label > span.rct-checkbox > svg")).click();
	       driver.findElement(By.cssSelector("#tree-node > div > button.rct-option.rct-option-expand-all > svg")).click();
	       driver.findElement(By.cssSelector("#tree-node > div > button.rct-option.rct-option-collapse-all > svg")).click();
	 	  

	}

}
