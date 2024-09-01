package steps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BedSheets_steps {
	
	WebDriver driver;
	
	@Given("User opens the browser, visits the naaptol webpage")
	public void user_opens_the_browser_visits_the_naaptol_webpage() {
	    
		driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
        driver.get("https://www.naaptol.com/");
		
	}

	@Given("hovers on Shopping Category, hovers on Home and Furniture tab")
	public void hovers_on_shopping_category_hovers_on_home_and_furniture_tab() {
	    
		Actions a = new Actions(driver);
	 	
        WebElement category = driver.findElement(By.xpath("//*[@class='cate_head']"));
        
        WebElement homeFurniture = driver.findElement(By.xpath("(//*[@class='catIconMenu homeDecor'])[1]"));
        
        a.moveToElement(category).build().perform(); // hovers on Shopping Category 
        a.moveToElement(homeFurniture).build().perform(); // Hovers on Home and Furniture Tab
	
		
	}

	@When("Clicks on BedSheets Tab")
	public void clicks_on_bed_sheets_tab() {
	    
		driver.findElement(By.linkText("Bedsheets")).click();
		
	}

	@Then("User should move to the Bedsheets page")
	public void user_should_move_to_the_bedsheets_page() {
	   
		String actualTitle = "Buy Bedsheets, Bed Covers, Bedding Sets, Bed Linen at Best Price in India on Naaptol.com";
		
		String expTitle =driver.getTitle(); // Expected Title
		
		Assert.assertEquals(actualTitle, expTitle); // Assert Title 
		
		driver.quit();
		
	}
	
	// Scenario -2 Price Range Checkbox
	
	@When("User clicks on price range checkbox")
	public void user_clicks_on_price_range_checkbox() {
	    
		driver.findElement(By.name("201 - 400")).click();
		
		driver.quit();
	}
	
	// Scenario -3 Wishlist 
	
	@When("User adds one product to wishlist")
	public void user_adds_one_product_to_wishlist() {
	    
		driver.findElement(By.xpath("(//*[@class='wish2'])[1]")).click(); // Add to wishlist
		
	}

	@Then("Login Page should display")
	public void login_page_should_display() {
	    
		String actual ="LOGIN / REGISTER";
		
		String expected = driver.findElement(By.xpath("//*[@class='heading']")).getText();
		
		Assert.assertEquals(expected, actual);  // Assert Text 
		
		driver.quit();
		
	}
	
	// Scenario - 4 Sort By 
	
	@When("User selects Sort by dropdown")
	public void user_selects_sort_by_dropdown() {
	    
		WebElement dropdown = driver.findElement(By.id("sortByFilter"));
		
		Select s = new Select(dropdown);
		
		s.selectByIndex(1); // Select Most Popular
		
		driver.quit();
				 				 				
	}
	
	// Scenario -5 User should able to Add products to cart
	
	@When("Click on product Click on Buy Now")
	public void click_on_product_click_on_buy_now() {
	    
		driver.findElement(By.cssSelector("a[title='Pack of 8 Premium 3D Print Natures Delight Bedsheet Sets (8BS16 3D)']")).click(); // click on 1st product 
		
		String parent = driver.getWindowHandle();
		
		Set<String> allHandles = driver.getWindowHandles();
		
		ArrayList<String> handles = new ArrayList<>(allHandles);
		
		String target = handles.get(1);
		
		driver.switchTo().window(target);
		
		driver.findElement(By.linkText("Click here to Buy")).click(); // Click on Buy Now Button
		
		driver.findElement(By.linkText("Proceed to Checkout")).click();  // Click on Proceed to CheckOut
										
	}

	@Then("User should move to the LoginPage")
	public void user_should_move_to_the_login_page() {
	    
		String actual ="https://www.naaptol.com/checkout/guestuserlogin.html";
		
		String expected = driver.getCurrentUrl();
		
		Assert.assertEquals(expected, actual);  // Assert Url 
		
		driver.quit();
				
		
	}






}
