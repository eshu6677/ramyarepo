package com.cucumberProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StepDefination {
	public static WebDriver driver;
	@Given("^User present in Adactin Login page$")
	public void openlogin() {
	System.setProperty("webdriver.ie.driver","‪‪‪C:\\Users\\DELL\\eclipse-Newworkspace\\cucumberProject\\drivers\\IEDriverServer.exe");
	driver=new InternetExplorerDriver();
	driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
	driver.manage().window().maximize();
	}
	@When("^User Enter User name$")
	public void Enterunpwd() {
	driver.findElement(By.id("username")).sendKeys("rameshadepu");
	}
	@And("^User Enter Password$")
	public void Enterpwd() {
	driver.findElement(By.id("password")).sendKeys("ramesh");
	}
	@And("^User Click on Login button$")
	public void clicklogin() {
	driver.findElement(By.id("login")).click();
	}
	@Then("^User navigate to login page$")
	public void Home() {
	driver.close();
	}


	

}
