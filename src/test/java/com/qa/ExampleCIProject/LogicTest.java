package com.qa.ExampleCIProject;

import static org.junit.Assert.*;

import org.junit.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentXReporter;

public class LogicTest {

	@Test
	public void secondTest() {
		
		assertEquals(10, 10);
		
	}
	
	@Test
	public void playTest() {

		ExtentHtmlReporter html = new ExtentHtmlReporter("Extent.html");
		ExtentXReporter extentx = new ExtentXReporter("localhost");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html, extentx);

		extent.createTest("TestName").pass("Test Passed");

		extent.createTest("TestName2").pass("Test Passed2");

		extent.flush();

		assertEquals(10, Logic.play(10, 10));

	}

}
