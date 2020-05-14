package com.utils;

import org.apache.commons.lang3.RandomStringUtils;

import com.base.BaseTest;

public class RestUtils extends BaseTest
{
	public static String getFirstName() 
	{
		String value=RandomStringUtils.randomAlphabetic(1);
		return(prop.getProperty("firstName")+ value);
		
	}
	

	public static String getLastName() 
	{
		String value=RandomStringUtils.randomAlphabetic(1);
		return(prop.getProperty("lastName")+ value);
		
	}

	public static String getUserName() 
	{
		String value=RandomStringUtils.randomAlphabetic(1);
		return(prop.getProperty("username")+ value);
		
	}

	public static String getpassword() 
	{
		String value=RandomStringUtils.randomAlphabetic(3);

		return(prop.getProperty("password")+ value);
		
	}

	public static String getEmail() 
	{
		String value=RandomStringUtils.randomAlphabetic(3);
		return(prop.getProperty("email")+ value);
		
	}

	public static String empName() 
	{
		String value=RandomStringUtils.randomAlphabetic(1);
		return(prop.getProperty("empname")+ value);
		
	}

	public static String empSal() 
	{
		String value=RandomStringUtils.randomAlphanumeric(5);
		return(prop.getProperty("empsalary")+ value);
		
	}
	public static String empAge() 
	{
		String value=RandomStringUtils.randomAlphabetic(2);
		return(prop.getProperty("empage")+ value);
		
	}

}
