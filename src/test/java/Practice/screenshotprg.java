package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotprg {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
	TakesScreenshot ts= (TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	//if we want to run this script n times and file name should be understaable that why we are craeting date
	//on which date we got the screenshot every time new file
	Date d= new Date();
	String date=d.toString().replace(" ","_").replace(":", "_");
	File dest=new File("./Screenshot/"+date+"errorshot.png");
	FileHandler.copy(src, dest);
	
	
}
}
