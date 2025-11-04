package com.ninja.crm.ObjectRepository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	
WebDriver driver;
 public loginpage (WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements( driver,this);
 }
@FindBy (id="username")
private WebElement Usernametextfield;

@FindBy (id="inputPassword")
private WebElement Passwordtextfield;

@FindBy (xpath="//button[text()='Sign In']")
private WebElement signinbutton;
public WebElement getUsernametextfield() {
	return Usernametextfield;
}

public WebElement getPasswordtextfield() {
	return Passwordtextfield;
}

public WebElement getSigninbutton() {
	return signinbutton;
}
	public void loginintoApplication(String URL,String USERNAME,String Password) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);
		getUsernametextfield().sendKeys(USERNAME);;
		getPasswordtextfield().sendKeys(Password);;
		getSigninbutton().click();
		
		
		
		}
}



