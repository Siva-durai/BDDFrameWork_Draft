package org.testing.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testing.commonutills.Commonutills;

public class HotelLoginPage extends Commonutills{
	
	public HotelLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	 public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(id="username")
     private WebElement username;
     @FindBy(id="password")
     private WebElement password;
     @FindBy(name="login")
     private WebElement submit;
     
     
     
     
	
   /*  public WebElement getUsername() {
		return username;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}*/

}
