package com.ninja.crm.product;


	

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Properties;
	import java.util.Random;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class ninjacreateProduct {

		public static void main(String[] args) throws IOException, InterruptedException {
			FileInputStream fis=new FileInputStream("C:\\Users\\kouse\\Downloads\\commondata.properties");
		     Properties p=new Properties();
		     p.load(fis);
		     
		     String BROWSER=p.getProperty("browser");
		     String URL=p.getProperty("url");
		     String USERNAME=p.getProperty("username");
		     String PASSWORD=p.getProperty("password");
		     
		     WebDriver driver=null;
		     if(BROWSER.equals("chrome"))// get data from property files
		     {
		    	 ChromeOptions settings=new ChromeOptions();
		     	 Map<String,Object> prefs=new HashMap<String,Object>();
		     	 prefs.put("profile.password_manager_leak_detection", false);
		     	 settings.setExperimentalOption("prefs", prefs);
		     	  
		     	driver=new ChromeDriver(settings);
		     }
		     else if(BROWSER.equals("firefox"))//we should keep change the browser in property file and run
		     {
		     	driver=new FirefoxDriver();
		     }
		     else if(BROWSER.equals("edge"))
		     {
		     	driver=new EdgeDriver();
		     }
		     else {
		     	driver= new ChromeDriver();
		     }
		     
		     
		     driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     driver.get(URL);
		    
		 	driver.findElement(By.id("username")).sendKeys("rmgyantra");
		 	driver.findElement(By.name("password")).sendKeys("rmgy@9999");
		 	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		 	
		 	driver.findElement(By.linkText("Products")).click();
		 	driver.findElement(By.xpath("//span[text()='Add Product']")).click();
		 	Random rm=new Random();
		 	int ranNum=rm.nextInt(1000);
		 	driver.findElement(By.name("productName")).sendKeys("Laptop"+ranNum);
		 	driver.findElement(By.name("quantity")).clear();
		 	driver.findElement(By.name("quantity")).sendKeys("2");
		 	driver.findElement(By.name("price")).clear();
		 	Thread.sleep(2000);
		 	driver.findElement(By.name("price")).sendKeys("");
		 
		 	
		 	
		 	WebElement element = driver.findElement(By.xpath("//select[@name='productCategory']"));
		 	WebElement element1= driver.findElement(By.name("vendorId"));
		 	Select s=new Select(element);
		 	Select s1=new Select(element1);
		 	s1.selectByIndex(1);
		 	s.selectByIndex(1);
		 	driver.findElement(By.xpath("//button[@type='submit']")).click();
		 	Thread.sleep(2000);
		 	WebElement pp = driver.findElement(By.xpath("//div[@role='alert']"));
		 	String text = pp.getText();
		 	if(text.contains("Successfully Added"))
		 	{
		 		System.out.println("Product created successfully");
		 	}
		 	else {
		 		System.out.println("Product not created");
		 	}
		 	
		 	
		 	
		 	
		 	
		 	driver.findElement(By.xpath("//button[contains(@class,'close-button Toastify')]")).click();
		 	driver.findElement(By.className("user-icon")).click();
		 	driver.findElement(By.xpath("//div[text()='Logout ']")).click();
	driver.quit();
		}

	}

