package com.ninja.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignspage {
	WebDriver driver;
	 public CreateCampaignspage  (WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements( driver,this);
	 }
@FindBy(name="campaignName")
private WebElement  campaignname;

@FindBy(name="campaignStatus")
private WebElement campaignstatus ;

@FindBy(name="targetAudience")
private WebElement targetaudience ;

@FindBy(name="description")
private WebElement descriptionfield ;

@FindBy(name="targetSize")
private WebElement targetsize;

@FindBy (name="expectedCloseDate")
private WebElement datefield;
public WebElement getTargetaudience() {
	return targetaudience;
}

public void setTargetaudience(WebElement targetaudience) {
	this.targetaudience = targetaudience;
}

public WebDriver getDriver() {
	return driver;
}

public WebElement getCampaignname() {
	return campaignname;
}

public WebElement getCampaignstatus() {
	return campaignstatus;
}

public WebElement getDescriptionfield() {
	return descriptionfield;
}

public WebElement getTargetsize() {
	return targetsize;
}

public WebElement getDatefield() {
	return datefield;
}

}
