package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "C:\\Users\\janus\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\Naaptol_Cucumber\\src\\test\\resources\\Naaptol_Home_Furniture", // Path to your feature files
    glue = "steps", 
    plugin = {  "html:target/cucumber-reports"} // Report options
    
)
public class Runner extends AbstractTestNGCucumberTests {

    
}

