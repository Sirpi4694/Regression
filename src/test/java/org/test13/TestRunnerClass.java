package org.test13;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Feature File\\login.feature",glue="org.test13",dryRun=false,monochrome=true)
public class TestRunnerClass  {
	
	
	
	
	

}
