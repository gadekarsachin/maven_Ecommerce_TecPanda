package Step_def;

import com.factory.Base_driver;
import com.pages.login_page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDepFile {
	
	
	// browser initialize karaycha mhanun base class cha object ce=reate karaycha
	//aple khare implementation he login class madeh ahe mhnun tyacha object crete kareycha
	
	Base_driver objectbas=new Base_driver();
	
	login_page objectlogin=new login_page(Base_driver.getDriver());
											
	@Given("user  is at login page")
	public void user_is_at_login_page() {
		//objectbas.initializedDriver("chrome");
		Base_driver.getDriver().get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
	
	
	}

	@When("user provide {string}and {string}")
	public void user_provide_sachingmailcom_and(String username, String password) {
	objectlogin.username(username);
	objectlogin.passname(password);;
	
	}

	@When("click on login button")
	public void click_on_login_button() {
	objectlogin.button();
	
	}

	@Then("use should be navigate to account page")
	public void use_should_be_navigate_to_account_page() {

	
	}

}
