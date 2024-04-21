package org.testing.stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testing.commonutills.Commonutills;
import org.testing.page_objects.BookedItinerary;

import io.cucumber.java.en.Then;

public class BookingConfirmationPage extends Commonutills{
	
	
	private static final Logger log = LogManager.getLogger(BookingConfirmationPage.class);
	
	BookedItinerary Bookingconfirm= new BookedItinerary();
	
	
		@Then("Vaildate the Booking Id")
		public void vaildate_the_booking_id()
				 throws IOException {
			try {
				
				implicit(10);
			Click(Bookingconfirm.getItinerary());			
			waitForWebElement(Bookingconfirm.getBookingId());
			attribute(Bookingconfirm.getBookingId());			
				ScreenShot("Bookingconfirmation");				
				Click(Bookingconfirm.getLogout());				
				
				
			} catch (IOException e) {
			    log.info("Payment Page Failed");
			    
			    
			}
		   
		}




}
