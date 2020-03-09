package com.run.pack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		monochrome = true,
		features="FeatureFolder",
		glue="com.org.rely",
		tags="@Saurab",
		plugin={"pretty:STDOUT","html:target/HTMLCucumberReport","json:target/Cucumber.json"}
		
)
public class RunnerClass //extends AbstractTestNGCucumberTests
{
	
	/*@Test
	public void f()
	{}*/

}
