package com.qa.ExampleCIProject;

import static org.junit.Assert.*;

import org.junit.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LogicTest {
	
	public ExtentReports report;
	public ExtentTest test;
	
	@Test
	public void playTest() {
		
		report = new ExtentReports(".\\BasicReport.html", true);

		test = report.startTest("Verify application Title");
		
		test.log(LogStatus.INFO, "Browser started");
		
		test.log(LogStatus.PASS, "verify Title of the page");
		
		report.endTest(test);
		report.flush();
		
		assertEquals(10,Logic.play(10,10));
		
	}

}
