package org.testing.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testing.commonutills.Commonutills;

public class GuestDeatilsPage extends Commonutills {
	
	public GuestDeatilsPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	public WebElement getFirstname() {
		return firstname;
	}

	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public void setCardno(WebElement cardno) {
		this.cardno = cardno;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cardno ;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	
	@FindBy(id="cc_type")
	private WebElement creditcardtype;
	
	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	public void setCreditcardtype(WebElement creditcardtype) {
		this.creditcardtype = creditcardtype;
	}

	public WebElement getCreditcardExpirymonth() {
		return creditcardExpirymonth;
	}

	public void setCreditcardExpirymonth(WebElement creditcardExpirymonth) {
		this.creditcardExpirymonth = creditcardExpirymonth;
	}

	public WebElement getCreditcardExpiryyear() {
		return creditcardExpiryyear;
	}

	public void setCreditcardExpiryyear(WebElement creditcardExpiryyear) {
		this.creditcardExpiryyear = creditcardExpiryyear;
	}
	@FindBy(id="cc_exp_month")
	private WebElement creditcardExpirymonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement creditcardExpiryyear;
	
	@FindBy(id="book_now")
	private WebElement booknow;
	
	public WebElement getBooknow() {
		return booknow;
	}

	public void setBooknow(WebElement booknow) {
		this.booknow = booknow;
	}

	public WebElement getOrderid() {
		return orderid;
	}

	public void setOrderid(WebElement orderid) {
		this.orderid = orderid;
	}
	@FindBy(id="order_no")
	private WebElement orderid;

}
