package com.testcases;

import org.testng.annotations.Test;

import com.base.BaseTest;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class GetRequest extends BaseTest
{ 
	public static ExtentTest tests;
	@Test
	public void getWetherDetails()
	{
		 tests = reports.startTest("GetRequest");
		
		testStatusCode();
		tests.log(LogStatus.PASS, "status code successfully deliverd");
		//testStatusLine();
	
	}
	

	

	

}
