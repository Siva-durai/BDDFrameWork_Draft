package org.testing.stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testing.commonutills.Commonutills;
import org.testing.page_objects.GuestDeatilsPage;

import io.cucumber.java.en.When;

public class PaymentPage extends Commonutills {
	
	private static final Logger log = LogManager.getLogger(PaymentPage.class);
	
	GuestDeatilsPage Payment= new GuestDeatilsPage();
	

		@When("User enter payment deatils and make payment")
		public void user_enter_payment_deatils_and_make_payment() throws IOException  {
			try {
		    // Write code here that turns the phrase above into concrete actions
				implicit(10);
			Sendkeys(Payment.getFirstname(), "MS");
			Sendkeys(Payment.getLastname(), "Dhoni");
			Sendkeys(Payment.getAddress(), "ranchi india");
			Sendkeys(Payment.getCardno(), "1234567891011121");
			Sendkeys(Payment.getCvv(), "567");
			dropdown(Payment.getCreditcardtype(),2 );
			dropdown(Payment.getCreditcardExpirymonth(), "6", false);
			dropdown(Payment.getCreditcardExpiryyear(), "2027", false);
			Click(Payment.getBooknow());
			
				ScreenShot("Payment Page");
			} catch (IOException e) {
				
				log.info("Payment Page");
				
				
			}
			
		}	
}
