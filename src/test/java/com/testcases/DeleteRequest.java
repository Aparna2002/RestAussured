package com.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.base.BaseTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;



public class DeleteRequest extends BaseTest
{
	@Test
	public void deleteRequest()
	{
		testStatusCode();
		testStatusLine();
		testSingleContent();
	
		/*
		 * RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		 * RestAssured.basePath="/delete/11493"; Response response= given()
		 * 
		 * .when() .delete() .then() .statusCode(200) .statusLine("HTTP/1.1 200 OK")
		 * .log().all() .extract().response(); String jsonAsString =
		 * response.asString();
		 * assertEquals(jsonAsString.contains("Succssfully deleted"), true);
		 */
		
				
	}

}
