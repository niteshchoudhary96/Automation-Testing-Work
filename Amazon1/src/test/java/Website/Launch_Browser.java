package Website;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Website_Details.WebSite_data;

public class Launch_Browser {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String url = "https://www.flipkart.com/";
		
		ChromeDriver driver = new ChromeDriver();
	
		
// Implicit wait
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
	  // Website url
	  driver.get(url);
	  
	// Locater- Name
	WebElement SearchBox = driver.findElement(By.name("q"));
	SearchBox.sendKeys("mobile");
	
		driver.switchTo().frame("iframeResult");
	// Locater id Select drop-down
	//WebElement SearchProduct = driver.findElement(By.xpath("//*[@class=\"_1sFryS _2x2Mmc\"]"));
	Select dropdown = new Select (SearchBox);
dropdown.selectByIndex(0);	


	
	
//
//	// Hover to reveal options
//	Actions actions = new Actions(driver);
//	actions.moveToElement(SearchProduct).perform();
//
//	// Click the desired option
//	driver.findElement(By.xpath("//*[@class=\"_1sFryS _2x2Mmc\"]//li[1]")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
   List <WebElement>Links = driver.findElements(By.tagName("a"));
   
   System.out.println("total img link :"+Links.size());
	
	
		
		

	}

}
