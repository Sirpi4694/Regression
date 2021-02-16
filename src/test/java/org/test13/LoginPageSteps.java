 package org.test13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageSteps {
	
	public static WebDriver d;
	
	@Given("User in on Facebook application Login Page")
	public void user_in_on_Facebook_application_Login_Page() {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		
	  
	}

	@When("user has to enter the {string} and {string}")
	public void user_has_to_enter_the_and(String emailId, String password) {
		WebElement email = d.findElement(By.id("email"));
		email.sendKeys(emailId);
	 	WebElement pass = d.findElement(By.id("pass"));
        pass.sendKeys(password);	   
	}

	@Then("user Should be in invalid credentials page")
	public void user_Should_be_in_invalid_credentials_page() {
		
	   
	}

	
	@Given("user has to launch chrome and hit the FB url")
	public void user_has_to_launch_chrome_and_hit_the_FB_url() {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.get("https://www.facebook.com/");
	   
	}

	@When("user has to enter the username and password")
	public void user_has_to_enter_the_username_and_password() {
		WebElement user = d.findElement(By.id("email"));
		user.sendKeys("SAV");
		WebElement pass = d.findElement(By.id("pass"));
		pass.sendKeys("Sirpi1234");
	  
	}

	@When("click the login button")
	public void click_the_login_button() {
		d.findElement(By.id("u_0_b")).click();
	   
	}

	@Then("user unable to enter the Home page")
	public void user_unable_to_enter_the_Home_page() {
		System.out.println("User Unable to Login");
	   
	}
}
