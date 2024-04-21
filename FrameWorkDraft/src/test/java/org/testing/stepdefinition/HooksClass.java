package org.testing.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testing.commonutills.Commonutills;
import org.testing.jvmreport.ReportJVM;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class HooksClass extends Commonutills  {
	
	private static final Logger log = LogManager.getLogger(HooksClass.class);
	
	@Before()
	public void beforeScenario(Scenario scenario) throws IOException {
			log.info("Execution started");
			//chromeBrowser();
			lanuchchromebrowser();
			//lanuchedgebrowser();
	}
	
	@After()
	public void afterScenario(Scenario scenario) throws IOException {
	log.info("Execution Finished");
	
	if(scenario.isFailed()){
	TakesScreenshot Ts= (TakesScreenshot) driver;
	byte[] Screenshot=Ts.getScreenshotAs(OutputType.BYTES);
	scenario.attach(Screenshot, "Image/png", "FailedScreenshotattached");
	
	}else {		
		TakesScreenshot Ts= (TakesScreenshot) driver;
		byte[] Screenshot=Ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(Screenshot, "Image/png", "Screenshotattached");		
		}
	close();
	}
	
	@AfterStep()
	public void afterStep(Scenario scenario) throws IOException {	
		TakesScreenshot Ts= (TakesScreenshot) driver;
		byte[] Screenshot=Ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(Screenshot, "Image/png", "Steps Screenshotattached");		
		}
}
