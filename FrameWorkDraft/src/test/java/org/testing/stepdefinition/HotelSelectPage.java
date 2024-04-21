package org.testing.stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testing.commonutills.Commonutills;
import org.testing.page_objects.SearchHotelPage;
import org.testing.page_objects.SelectHotel;

import io.cucumber.java.en.When;

public class HotelSelectPage extends Commonutills{
	
	SearchHotelPage HotelSelect= new SearchHotelPage();
	SelectHotel   HotelSelect1= new SelectHotel();
	
	private static final Logger log = LogManager.getLogger(HotelSelectPage.class);
	
		@When("User search and select hotel")
		public void user_search_and_select_hotel() throws IOException, InterruptedException {	    
			try {
			
				implicit(10);
				
				dropdown(HotelSelect.getLocation1(), 2);
				Thread.sleep(2000);
				dropdown(HotelSelect.getHotels(), "Hotel Creek", false);
				Thread.sleep(2000);
				dropdown(HotelSelect.getRoomtype(), "Double", false);
				Thread.sleep(2000);
				dropdown(HotelSelect.getRoomno(), "6", false);
				Thread.sleep(2000);
				dropdown(HotelSelect.getAproom(), "2", false);
				Thread.sleep(2000);
				dropdown(HotelSelect.getCproom(), "3", false);
				Thread.sleep(2000);
				Click(HotelSelect.getSubmit());
				//ScreenShot("HotelSelectVaildatePage");
		        
		        Click(HotelSelect1.getRadio());
		        Click(HotelSelect1.getSubmit2());
		               
				} catch (InterruptedException e) {					
					log.info("Hotel select page error");				
				}			
		}

}
