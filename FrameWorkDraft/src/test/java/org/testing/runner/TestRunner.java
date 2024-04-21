package org.testing.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testing.jvmreport.ReportJVM;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/Features",glue="org.testing.stepdefinition",dryRun=false,monochrome=true,
	                 plugin= {"json:src\\test\\resources\\Reports\\HTMLReport\\report.json",
	                		 "html:src\\test\\resources\\Reports\\HTMLReport\\report.html",           		 
	                		 },
	         tags=("@Regression1"))
	//return:target/failed_scenarios.txt
	//html:target/cucumber-reports/report.html
		

	public class TestRunner{	
		
	@AfterClass
	public static void report() {
		ReportJVM.generateJVMReport("src\\test\\resources\\Reports\\HTMLReport\\report.json");
		
	}


}
