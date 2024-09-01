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

public class BedBath_steps {
	
	WebDriver driver;
	
	@Given("User Opens the browser, enters naaptol url")
	public void user_opens_the_browser_enters_naaptol_url() {
		
		driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
        driver.get("https://www.naaptol.com/");
	}

	@Given("hovers on Category, hovers on Home and Furniture")
	public void hovers_on_category_hovers_on_home_and_furniture() {
	    
		 	Actions a = new Actions(driver);
		 	
	        WebElement category = driver.findElement(By.xpath("//*[@class='cate_head']"));
	        
	        WebElement homeFurniture = driver.findElement(By.xpath("(//*[@class='catIconMenu homeDecor'])[1]"));
	        
	        a.moveToElement(category).build().perform(); // hovers on Shopping Category 
	        a.moveToElement(homeFurniture).build().perform(); // Hovers on Home and Furniture Tab
		
	}

	@When("Clicks on Bed and Bath link")
	public void clicks_on_bed_and_bath_link() {
	    
		driver.findElement(By.linkText("Bed & Bath")).click();
		
	}

	@Then("Asserts title of the page")
	public void asserts_title_of_the_page() {
		
		String actualTitle = "Bed Bath Online Store in India - Buy Latest Bed Bath Online at Best Price Deals - Naaptol.com";
		
		String expTitle =driver.getTitle(); // Expected Title
		
		Assert.assertEquals(actualTitle, expTitle); // Assert Title 
		
		driver.quit();
	}
	
	// Scenario -2 Buying a Product 
	@When("Clicks on 1st product, Clicks on Buy Now, Proceed to checkout")
	public void clicks_on_1st_product_clicks_on_buy_now_proceed_to_checkout() {
	    
		driver.findElement(By.xpath("(//img[@alt='Foldable Double Bed Mosquito Net Buy 1 Get 1 Free (DMN2)'])[3]")).click();
		
		String parent = driver.getWindowHandle(); // Parent Handle (Current Page)
		
		Set<String> allHandles = driver.getWindowHandles();
		
		ArrayList<String> handles = new ArrayList<>(allHandles);  // Storing all Window Handles
		
		String newHandle = handles.get(1);
		
		driver.switchTo().window(newHandle);
		
		driver.findElement(By.linkText("Click here to Buy")).click(); // Click on Buy Now Button
		
		driver.findElement(By.linkText("Proceed to Checkout")).click();  // Click on Proceed to CheckOut
		
		
		
	}

	@Then("Assert the login output")
	public void assert_the_login_output() {
	    
		String actual ="https://www.naaptol.com/checkout/guestuserlogin.html";
		
		String expected = driver.getCurrentUrl();
		
		Assert.assertEquals(expected, actual);  // Assert Url 
		
		driver.quit();
		
		
	}




	
}
