package com.qa.hubspot.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	
	
	public WebDriver  driver ;
	
	public Properties prop ;
	
	
	public WebDriver  initialize_driver() {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().window().fullscreen();
		 
		 
		 return driver;
		
}
	
	public Properties  initialize_Properties() {
		
		prop = new Properties();
		
		try {
			FileInputStream ip = new FileInputStream("C:\\Workspace\\JanPomSeries\\src\\main\\java\\com\\qa\\hubspot\\config\\config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return prop ;
	}
	
	
	
	

}
