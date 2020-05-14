package com.base;
import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;


public class MyExtentManager extends BaseTest
{
     public static ExtentReports extent;
	   
	   public static ExtentReports getInstance() {
		  if(extent==null) { 
		   Date dt=new Date();
		  String filepath = dt.toString().replace(":","_").replace(":", "_")+".html";
		  
	       extent = new ExtentReports(projectPath+"//HTMLReports"+"filepath");
	       
	       extent.loadConfig(new File(projectPath+"//extentreportconfig.xml"));
		  }  
	     return extent;
	   }
	


}
