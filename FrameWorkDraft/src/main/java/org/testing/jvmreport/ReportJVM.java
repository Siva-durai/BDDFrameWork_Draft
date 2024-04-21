package org.testing.jvmreport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportJVM {
	
public static void generateJVMReport(String json) {
		
		File loc= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReports");
		Configuration con = new Configuration(loc,"BddFrameWork");	
		
		con.addClassifications("Env","QA");
		con.addClassifications("Sprint","Sprint1");
		con.addClassifications("Testing_Type","Regression");
		con.addClassifications("ExecutedBy","SivaKumar Duraisamy");
		
		List<String> jsonFiles= new ArrayList<String>();
		jsonFiles.add(json);
		ReportBuilder r = new ReportBuilder(jsonFiles,con);
		r.generateReports();
		
	
	}

}
