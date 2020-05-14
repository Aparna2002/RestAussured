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




public class PostRequest extends BaseTest
{
	
	public static HashMap map=new HashMap();
	
	@Test
	public void postData() 
	{
		
		map.put("FirstName", RestUtils.getFirstName());
		map.put("LastName", RestUtils.getLastName());
		map.put("UserName", RestUtils.getUserName());
		map.put("Password", RestUtils.getpassword());
		map.put("email", RestUtils.getEmail());
		given()
		  .contentType("application/json")
		  .body(map)
		 .when() 
		   .post();
		testStatusCode();
		//testStatusLine();
		
		/*
		 * RestAssured.baseURI="http://restapi.demoqa.com/customers";
		 * RestAssured.basePath="/register";
		 */
		
		
		/*
		 * }
		 * 
		 * @Test public void testPostRequest() { given()
		 * .contentType("application/json") .body(map)
		 * 
		 * .when() .post()
		 * 
		 * .then() .statusCode(200) .log().all() .and() .body("SuccessCode",
		 * equalTo("OperationSuccess")) .and()
		 * .body("Message",equalTo("Operation completed successfully"));
		 */
		   
		
		
		
	}
	

}
