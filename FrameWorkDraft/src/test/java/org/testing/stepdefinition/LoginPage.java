package org.testing.stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testing.commonutills.Commonutills;
import org.testing.page_objects.HotelLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends Commonutills{
	
	private static final Logger log = LogManager.getLogger(LoginPage.class);

	HotelLoginPage Login=new HotelLoginPage();
	
	//Given User launches booking "<URL>" application
	@Given("User launches booking {string} application")
	public void user_launches_booking_application(String URL) throws IOException {
		//chromeBrowser();
		//try {
		URLLanuch(URL);		
		log.info(URL);			
		//} catch (IOException e) {			
			log.info("Apllication is not Lancuhed");
			
			
		//}	
	    
	}
	//When User click on login then enter "<Username>" and "<password>"
	@When("User click on login then enter {string} and {string}")
	public void user_click_on_login_then_enter_and(String Username, String password) throws IOException{		
	/*	try {
		implicit(10);
	
		Sendkeys(Login.getUsername(), Username);
		Sendkeys(Login.getPassword(), password);
		Click(Login.getSubmit());
		implicit(10);
		
		
		}catch (IOException e) {			
			log.info("Invaild user name and password ");		
			}
	}*/
	
		implicit(10);		
		Sendkeys(Login.getUsername(), Username);
		Sendkeys(Login.getPassword(), password);
		Click(Login.getSubmit());
		implicit(10);
		ScreenShot(Username);
	
			
}
	
	
}

	
	
	
