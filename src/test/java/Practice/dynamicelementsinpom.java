package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dynamicelementsinpom {
	WebDriver driver;
	 public dynamicelementsinpom(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements( driver,this);
	 }
	 
	 @FindBy (xpath="//input[@type='text']")
	 private WebElement searchtf;
	 
	 @FindBy(xpath="//option[text()='Search by Campaign Name']")
	 private WebElement searchdd;
	public WebElement getSearchtf() {
		return searchtf;
	}

	public WebElement getSearchdd() {
		return searchdd;
	}
}
