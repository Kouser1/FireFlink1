package com.ninja.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductpage {
	
	WebDriver driver;
	 public CreateProductpage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements( driver,this);
	 }
@FindBy (name="productName")
private WebElement productnametextfield ;

@FindBy (name="quantity")
private WebElement quantitytextfield ;

@FindBy (name="productCategory")
private WebElement productcatfield ;

@FindBy (name="price")
private WebElement pricetextfield ;

@FindBy (name="vendorId")
private WebElement vendoridfield ;

@FindBy(xpath="//button[@type='submit']")
private WebElement addbutton;
public WebDriver getDriver() {
	return driver;
}

public WebElement getProductnametextfield() {
	return productnametextfield;
}

public WebElement getQuantitytextfield() {
	return quantitytextfield;
}

public WebElement getProductcatfield() {
	return productcatfield;
}

public WebElement getPricetextfield() {
	return pricetextfield;
}

public WebElement getVendoridfield() {
	return vendoridfield;
}

public WebElement getAddbutton() {
	return addbutton;
}

}
