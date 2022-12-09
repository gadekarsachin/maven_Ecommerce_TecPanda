package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/feature"},
		
		glue = {"Step_def","Hooks"}
		 
		
		)
public class login_Runner {

}
