package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;
import static io.restassured.RestAssured.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.restassured.response.Response;



public class BaseTest 
{
public static String projectPath = System.getProperty("user.dir");
    public static ExtentReports reports=MyExtentManager.getInstance();
    public static ExtentTest tests;
	
	//public static FileInputStream fis;
	public static Properties prop;
	public String path;
	
	
	
  @BeforeTest
  public void init() throws IOException 
  {
		System.out.println("iam before test method.....");
	  //initializing envproperty file 
	 FileInputStream fis = new FileInputStream("C:\\Users\\GOPALAKRISHNA\\eclipse-workspace\\APITESTING\\RestAssuredWithBdd\\src\\test\\java\\com\\utils\\environment.properties");
			  prop = new Properties();
			  prop.load(fis);
			 path=  prop.getProperty("pathurl");
			 
			  System.out.println("environment property file initilized : "+path);
  }  
 
  public void testStatusCode() 
  {
	  Response response=
				given() 
				.when()
				   .get(path)
				.then()
				    .statusCode(200)
				    .statusLine("HTTP/1.1 200 OK")
				    .log().all()
				    .extract().response();
				String jsonAsString = response.asString();
				
				
	 
  }
  
  public void testStatusLine()
  {
	  given()
	   .when()
	      .get(path)
	      .then()
	      .statusLine("HTTP/1.1 200 OK")
	      .log().all();
  }
  
  public void testSingleContent()
  {
	  Response response=
	  given()
	   .when()
	      .get(prop.getProperty("pathurl2"))
	      .then()
	      .statusCode(200)
	      .body("RestResponse.result.name",equalTo(prop.getProperty("country")))//get it in properties file
	      .log().all()
	      .extract().response();
	  String jsonAsString=response.asString();
	  
  }
 
  public void testMultipleContent()
  {
	  Response response=
	  given()
	   .when()
	   .get(prop.getProperty("pathurl2"))
	      .then()
	      .statusCode(200)
	      .body("RestResponse.result.name",hasItems(prop.getProperty("countries")))
	      .log().all()
	      .extract().response();
	  String jsonAsString=response.asString();
	  
  
  
		 
  }

}
