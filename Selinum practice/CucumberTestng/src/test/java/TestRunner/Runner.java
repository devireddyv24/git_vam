package TestRunner;


import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@Test
@CucumberOptions(

		features = "D:\\MyFramewok\\TestNgreports\\Features\\ActitimeLogin.feature", glue = "Testclass",

		plugin = { "pretty", "json:target/cucumber-reports/cucumber.json",	"html:target/cucumber-reports/cucumberreport.html", }, monochrome = true)
public class Runner extends AbstractTestNGCucumberTests {
	

}
