package com.run.pack;

import cucumber.api.java.After;

public class Hooks extends BaseClass
{

	
	@After
	public void tear()
	{
		driver.quit();
	}
}
