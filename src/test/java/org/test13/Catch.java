package org.test13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Catch extends BaseClass {
	
	@Given("User in on catch application Login Page")
	public void user_in_on_catch_application_Login_Page() {
		
	    launchBrowser();
	    launchurl("https://www.catch.com.au/");
	    maxwindow();
	}

	@When("user has to select the mens wear")
	public void user_has_to_select_the_mens_wear() {
		WebElement element = driver.findElement(By.xpath("//a[@data-target='mens-fashion']"));
		movetoelement(element);
	}

	@When("click the polo shirts")
	public void click_the_polo_shirts() {
		WebElement element = driver.findElement(By.xpath("//a[@data-category-name='Polo Shirts']")); 
	    btnclick(element);
	   
	}

	@When("user has to select white t-shirt")
	public void user_has_to_select_white_t_shirt() {
	   WebElement element = driver.findElement(By.xpath("(//a[@data-product-id=\"411703\"])[3]"));
	   btnclick(element);
	}

	@When("user should  select size")
	public void user_should_select_size() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement size = driver.findElement(By.xpath("//div[@class='product-attribute-list']"));
		 size.click();
		 WebElement selectSize = driver.findElement(By.xpath("//li[@data-size-label='M']"));
		 selectSize.click();
//		 Select s = new Select(size);
//		 s.selectByIndex(3);
	}

	@When("user has to click add cart button")
	public void user_has_to_click_add_cart_button() {
		WebElement element = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	@Then("product added to cart succesfully")
	public void product_added_to_cart_succesfully() {
	   System.out.println("added to cart successfully");
	}

}







            //PageFactory.initElements(driver, this);