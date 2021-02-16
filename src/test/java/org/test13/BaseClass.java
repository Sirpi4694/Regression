  package org.test13;

import java.awt.Robot;
import java.sql.Driver;

import javax.swing.text.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
public static Actions a;
public static Robot r;
	public static void launchBrowser() {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
	}
	public static void launchurl(String url) {
driver.get(url);
	}
	public static void maxwindow() {
driver.manage().window().maximize();
	}
	public static void closeBrowser() {
driver.quit();
	}
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}
	public static void pageurl() {
String url = driver.getCurrentUrl();
System.out.println(url);
	}
	public static void fill(WebElement element,String text) {
		element.sendKeys(text);
	}
	public static void btnclick(WebElement element) {
		element.click();
	}
	public static void closetab() {
		driver.close();
	}
	public static String gettxt(WebElement element) {
		String txt = element.getText();
return txt;
	}
	public static void byvalue(WebElement element,String text) {
		Select s = new Select(element);
		s.selectByValue(text);
	}
	public static void byindex(WebElement element,int index) {
		 Select s = new Select(element);
		 s.selectByIndex(index);
	}
	public static void byvisibletext(WebElement element,String text) {
		 Select s = new Select(element);
		 s.selectByVisibleText(text);
	}
	public static void movetoelement(WebElement element) {
		  a = new Actions(driver);
		 a.moveToElement(element).perform();
	}
	public static void dragAnddrop(WebElement src,WebElement des) {
		 a = new Actions(driver);
		 a.dragAndDrop(src, des).perform();
	}
	public static void clickTWice(WebElement element) {
		a=new Actions(driver);
		a.doubleClick(element).perform();
	} 
	public static void rightClick(WebElement element) {
			a= new Actions(driver);
			a.contextClick(element).perform();
			
		} 
		}
