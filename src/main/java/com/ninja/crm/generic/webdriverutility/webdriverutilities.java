package com.ninja.crm.generic.webdriverutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class webdriverutilities {
public void handledropdown(WebElement dd,int index)
{
	Select s=new Select(dd);
	s.selectByIndex(index);
}
public void mousehover(WebDriver driver,WebElement ele) {
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
}

public void implicitlywait(WebDriver driver,int sec)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
}
}
