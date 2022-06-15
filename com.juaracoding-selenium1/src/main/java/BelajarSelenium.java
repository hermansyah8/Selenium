import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BelajarSelenium {

	public static void main(String[] args) {
		
		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver_win32\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        String url ="http://google.com/";
        driver.navigate().to(url);  
        
          
         //Maximize the browser  
          driver.manage().window().maximize();   
          
         // Click on the Search button  
        driver.findElement(By.linkText("gmail")).click(); 
        
        
        //Scroll down the webpage by 5000 pixels  
      JavascriptExecutor js = (JavascriptExecutor)driver;  
      js.executeScript("scrollBy(0, 1000)");  
  
    }  
  

	}


