package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Feature File\\FB.feature",glue="org.stepdefinition",dryRun=true,
plugin= {"html:target","json:target//output.json"})
public class RunnerClass {

}
