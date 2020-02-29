package com.org.rely;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;

	@Given("I have the site up and running")
	public void givenmethod() {

		System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("I enter correct (\\w+) and (\\w+)")
	public void whenmethod(String user, String password) {
		
		Assert.assertEquals("OrangeHRM", driver.getTitle());
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys(user);

		WebElement pass = driver.findElement(By.id("txtPassword"));
		pass.sendKeys(password);

		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
	}

	@Then("I should go to home page")
	public void thenmethod() 
	{
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/dashboard", driver.getCurrentUrl());

		driver.quit();
	}

	@When("I try to check negative flow with (.*) and (\\w+)")
	public void when2method(String user, String password) {
		Assert.assertEquals("OrangeHRM", driver.getTitle());
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys(user);

		WebElement pass = driver.findElement(By.id("txtPassword"));
		pass.sendKeys(password);

		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
	}

	@Then("I should stay in the login page")
	public void then2method() {
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials", driver.getCurrentUrl());

		driver.quit();
	}
}
