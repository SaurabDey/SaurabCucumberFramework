package com.org.rely;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.run.pack.BaseClass;

import cucumber.api.java.en.Then;

public class AnotherStep extends BaseClass {

	@Then("I should be able to click and check marketplace")
	public void marketver() {

		WebElement marketButton = driver.findElement(By.id("MP_link"));
		marketButton.click();

	}
}
