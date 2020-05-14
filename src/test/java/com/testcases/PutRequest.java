package com.testcases;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.utils.RestUtils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
public class PutRequest extends BaseTest
{
	public static HashMap map= new HashMap();
	String emp_Name=RestUtils.empName();
	String emp_Salary=RestUtils.empSal();
	String emp_Age=RestUtils.empAge();
	int emp_id=11501;
	@SuppressWarnings("unchecked")
	@BeforeClass
	public void putData()
	{
		map.put("Name", emp_Name);
		map.put("Salary", emp_Salary);
		map.put("Age", emp_Age);
		RestAssured.baseURI=prop.getProperty("baseURI");
		RestAssured.basePath=prop.getProperty("basePAth");
		
	}
	@Test
	public void testPutRequest()
	{
		given()
		   .contentType("application/json")
		   .body(map)
		.when()
		   .put();
		testStatusCode();
		
		
		
		
	}

}
