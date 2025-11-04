package com.ninja.crm.ObjectRepository;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	 public Homepage (WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements( driver,this);
	 }
@FindBy (linkText="Campaigns")
private WebElement campaignslink;

@FindBy(linkText="Products")
private WebElement productlink;

@FindBy(className="user-icon")
private WebElement profileicon;

@FindBy(xpath="//div[text()='Logout ']")
private WebElement logouticon;
public WebElement getCampaignslink() {
	return campaignslink;
}

public WebElement getProductlink() {
	return productlink;
}

public WebElement getProfileicon() {
	return profileicon;
}

public WebElement getLogouticon() {
	return logouticon;
}

}
