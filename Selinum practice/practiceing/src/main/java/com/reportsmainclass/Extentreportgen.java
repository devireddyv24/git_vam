package com.reportsmainclass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreportgen {
	public static ExtentHtmlReporter report;
	public static ExtentReports rep;
	public static ExtentTest test;
	public static void reports() {
	report=new ExtentHtmlReporter("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\Reports\\re2.html");
		 rep=new ExtentReports();
		rep.attachReporter(report);
		 test=rep.createTest("Actions","Drogedby");
	}

}
