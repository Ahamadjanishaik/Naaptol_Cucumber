package steps;

import java.time.Duration;

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

public class DiwanSets {
	
	WebDriver driver;
	
	@Given("Open Browser and enter Naaptol url and search")
	public void open_browser_and_enter_naaptol_url_and_search() {
		
		driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
        driver.get("https://www.naaptol.com/");
	}

	@Given("Hover on Shopping Category and Home Linen Furnishing")
	public void hover_on_shopping_category_and_home_linen_furnishing() {
		
		Actions a = new Actions(driver);
        WebElement category = driver.findElement(By.xpath("//*[@class='cate_head']"));
        WebElement homeFurniture = driver.findElement(By.xpath("(//*[@class='catIconMenu homeDecor'])[1]"));
        a.moveToElement(category).build().perform();
        a.moveToElement(homeFurniture).build().perform();
        
	}

	@When("Click on Diwan Sets tab")
	public void click_on_diwan_sets_tab() {
	    
		driver.findElement(By.linkText("Diwan Sets")).click();       // Click on Diwan Sets 
		
	}

	@Then("Assert if the user is redirected to Diwan Sets page")
	public void assert_if_the_user_is_redirected_to_diwan_sets_page() {
	    
		String url = "https://www.naaptol.com/shop-online/home-decor/bed-bath/diwan-sets.html";
		
		Assert.assertEquals(driver.getCurrentUrl(), url);
		
		driver.quit();
	}
	
	// Scenario -2 COD Check box
	
	@When("Click on Cash On Delivery Checkbox")
	public void click_on_cash_on_delivery_checkbox() {
	   
		driver.findElement(By.name("iscod")).click();  // Click on Cash on Delivery Checkbox
		
	}

	@Then("User should able to click search")
	public void user_should_able_to_click_search() {
	    
		driver.findElement(By.xpath("(//*[@class='button_1'])[1]")).click();  // Click on Set Button
		
		driver.quit();
		
	}
	
	// Scenario -3 Free Delivery Check box

	@When("Click on Free Delivery Checkbox")
	public void click_on_free_delivery_checkbox() {
	    
		driver.findElement(By.name("isfreeship")).click();            // Click on Free Delivery Checkbox
		
		
	}

	@Then("User should able to search")
	public void user_should_able_to_search() {
	    
		driver.findElement(By.xpath("(//*[@class='button_1'])[1]")).click();  // Click on Set Button
		
		driver.quit();
		
	}
	
	// Scenario -4 Compare Products 

	@When("Click on Add compare tab of different products")
	public void click_on_add_compare_tab_of_different_products() {
	    
		driver.findElement(By.xpath("(//*[@catname='Diwan Sets'])[1]")).click();   // Add to Compare 1st product
		
		driver.findElement(By.xpath("(//*[@catname='Diwan Sets'])[2]")).click();  // Add to Compare 2nd product 
		
		driver.quit();
		
	}
	
	// Scenario - 5 Sort Products
	
	@When("Sort products by Most Expensive")
	public void sort_products_by_most_expensive() {
	   
		WebElement dropdown = driver.findElement(By.id("sortByFilter"));
		
		Select s = new Select(dropdown);
		
		s.selectByIndex(4); // Select Most Expensive
		
		driver.quit();
		
		
	}
	
}
