package com.qa.hubspot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.hubspot.Base.BasePage;

public class LoginPage extends BasePage {

	
//  1 (a)-define page objects (PAGE OR) : using Page Factory Pattern
	
	


	@FindBy(id="username")
	
	WebElement emailId ;
	
	
	@FindBy(id= "password")
	
	WebElement password ;
	
	@FindBy (id ="loginBtn")
	
	WebElement loginButton;
	
	@FindBy( id= "Sign up ")
	
	WebElement signUpLink;



	
	
	// 1( b) -Constructor of page class and initialize elements with driver
	
	
	public LoginPage(WebDriver driver) { 
		
		this.driver = driver ;
		
		PageFactory.initElements(driver, this); 
	}
		
		// methods
		
		public String getLoginPageTitle(){
			 return driver.getTitle();
				 
		}
		
		public boolean VerifySignUpLink() {
		return signUpLink.isDisplayed();
		}
			
		
		public void login(String un ,String pwd){
			
			 emailId.sendKeys(un);
			 
			 password.sendKeys(pwd);
			 
			 loginButton.click();
			 
			 
		}
		
		
			
		}
	

		
	

