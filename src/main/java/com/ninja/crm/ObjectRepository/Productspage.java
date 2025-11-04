package com.ninja.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productspage {
	WebDriver driver;
	 public Productspage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements( driver,this);
	 }
@FindBy(xpath="//span[text()='Add Product']")
private WebElement productspage;
public WebElement getProductspage() {
	return productspage;
}


}
