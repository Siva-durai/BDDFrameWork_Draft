package org.testing.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testing.commonutills.Commonutills;

public class SelectHotel extends Commonutills{
	
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@type='radio']")
	private WebElement radio;

	public WebElement getRadio() {
		return radio;
	}

	public void setRadio(WebElement radio) {
		this.radio = radio;
	}
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit2;

	public WebElement getSubmit2() {
		return submit2;
	}

	public void setSubmit2(WebElement submit2) {
		this.submit2 = submit2;
	}

}
