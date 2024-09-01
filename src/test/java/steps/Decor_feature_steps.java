package steps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Decor_feature_steps  {
	
	 WebDriver driver;

	    @Given("Open the browser, enter naaptol url")
	    public void open_the_browser_enter_naaptol_url() {
	        
	    	driver = new ChromeDriver();
	    	
	    	driver.manage().window().maximize();
	    	
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	
	        driver.get("https://www.naaptol.com/");
	    }

	    @Given("hover on Category, hover on Home and Furniture")
	    public void hover_on_category_hover_on_home_and_furniture() {
	        Actions a = new Actions(driver);
	        WebElement category = driver.findElement(By.xpath("//*[@class='cate_head']"));
	        WebElement homeFurniture = driver.findElement(By.xpath("(//*[@class='catIconMenu homeDecor'])[1]"));
	        a.moveToElement(category).build().perform();
	        a.moveToElement(homeFurniture).build().perform();
	    }

	    @When("Click on Decor link")
		public void click_on_decor_link() {
		    
			driver.findElement(By.linkText("Decor")).click();
			
		}

		@Then("Assert title of the page")
		public void assert_title_of_the_page() {
		   
			String actual ="Decor Online Store in India - Buy Decor at Best Price on Naaptol Online Shopping";
			
			String expected = driver.getTitle();
			
			Assert.assertEquals(actual, expected);   
			
			driver.quit();
			
		}
		
		// Scenario -2 Click on COD checkbox
		
		@Then("Click on COD checkbox")
		public void click_on_cod_checkbox() {
		    
			driver.findElement(By.name("iscod")).click();  // Click on Cash on Delivery Checkbox
			
			driver.findElement(By.xpath("(//*[@class='button_1'])[1]")).click();  // Click on Set Button 
			
			driver.quit();
		}
		
		//Scenario -3 Click on Buy Now 
		
		@When("Click on 1st product, click on Buy Now, proceed to checkout")
		public void click_on_1st_product_click_on_buy_now_proceed_to_checkout() {
		    
			driver.findElement(By.xpath("(//*[@alt='Pack of 4 - 3D Wall Stickers (3DWS1)'])[1]")).click(); // Click on Buy Now Button
			
			String parent = driver.getWindowHandle();
			
			Set<String> allHandles = driver.getWindowHandles();
			
			ArrayList<String> handles = new ArrayList<>(allHandles);
			
			String newHandle = handles.get(1);
			
			driver.switchTo().window(newHandle);
			
			driver.findElement(By.linkText("Click here to Buy")).click(); // Click on Buy Now Button
			
			driver.findElement(By.linkText("Proceed to Checkout")).click();  // Click on Proceed to CheckOut
			
			
		}

		@Then("Assert the output")
		public void assert_the_output() {
		    
			String actual ="https://www.naaptol.com/checkout/guestuserlogin.html";
			
			String expected = driver.getCurrentUrl();
			
			Assert.assertEquals(expected, actual);  // Assert Text 
			
			driver.quit();
		}



	
	
}
