package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageSteps {
	
	
	public static WebDriver driver;
	
	
	@Given("user has to launch chrome and hit the FB url")
	public void user_has_to_launch_chrome_and_hit_the_FB_url() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}

	@When("user has to enter the username and password")
	public void user_has_to_enter_the_username_and_password(io.cucumber.datatable.DataTable d) {
	   List<Map<String, String>> mp = d.asMaps();
	   driver.findElement(By.id("email")).sendKeys(mp.get(0).get("username"));
	   driver.findElement(By.id("pass")).sendKeys(mp.get(1).get("password"));
	    
	}

	@When("click the login button")
	public void click_the_login_button() {
		driver.findElement(By.id("u_0_b")).click();
	   
	}

	@Then("user unable to enter the home page")
	public void user_unable_to_enter_the_home_page() {
		System.out.println("User Unable to Login");
		
	}
	
	@When("user has to click the forget password link")
	public void user_has_to_click_the_forget_password_link() {
	    
	}

	@When("user has to enter the mobile number")
	public void user_has_to_enter_the_mobile_number() {
	    
	}

	@When("click the search button")
	public void click_the_search_button() {
	   
	}

	@Then("user has to navigate OTP page")
	public void user_has_to_navigate_OTP_page() {
	   
	}






}
