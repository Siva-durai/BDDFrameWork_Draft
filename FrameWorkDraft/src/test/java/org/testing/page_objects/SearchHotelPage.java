package org.testing.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testing.commonutills.Commonutills;

public class SearchHotelPage extends Commonutills {
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement location1; 

	@FindBy(xpath="//*[@id='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//*[@id='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath="//*[@id='room_nos']")
	private WebElement roomno;
	
	@FindBy(xpath="//*[@id='adult_room']")
	private WebElement aproom;
	
	@FindBy(xpath="//*[@id='child_room']")
	private WebElement cproom;

	public WebElement getLocation1() {
		return location1;
	}

	public void setLocation1(WebElement location1) {
		this.location1 = location1;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(WebElement roomtype) {
		this.roomtype = roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public void setRoomno(WebElement roomno) {
		this.roomno = roomno;
	}

	public WebElement getAproom() {
		return aproom;
	}

	public void setAproom(WebElement aproom) {
		this.aproom = aproom;
	}

	public WebElement getCproom() {
		return cproom;
	}

	public void setCproom(WebElement cproom) {
		this.cproom = cproom;
	}
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

}
