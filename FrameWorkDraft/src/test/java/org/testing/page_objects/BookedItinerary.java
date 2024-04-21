package org.testing.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testing.commonutills.Commonutills;



public class BookedItinerary extends Commonutills {
	
	
	public BookedItinerary(){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="my_itinerary")
	private WebElement Itinerary;
	
	public WebElement getItinerary() {
		return Itinerary;
	}

	public void setItinerary(WebElement itinerary) {
		Itinerary = itinerary;
	}

	public WebElement getOrder() {
		return Order;
	}

	public void setOrder(WebElement order) {
		Order = order;
	}
	@FindBy(xpath="//*[@class='select_text'][1]")
	private WebElement Order;
	
	@FindBy(id="logout")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
	}
	
	@FindBy(xpath="//*[@onfocus='disable_ctrlV()'][1]")
	private WebElement bookingId;

	public WebElement getBookingId() {
		return bookingId;
	}

	public void setBookingId(WebElement bookingId) {
		this.bookingId = bookingId;
	}

}
