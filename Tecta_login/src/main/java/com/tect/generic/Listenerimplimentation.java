package com.tect.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerimplimentation extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result)
	{
	
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		String res = result.getName();
		TakesScreenshot t =(TakesScreenshot)d;
		    File src = t.getScreenshotAs(OutputType.FILE);
		    File dest = new File("./ScreenShot/"+res+".png");
		    try {
		    	FileUtils.copyFile(src, dest);
				
			} catch (IOException e) {
				
			}
		
	}
	

	@Override
	public void onTestSkipped(ITestResult result) {
        
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
	
	}

	@Override
	public void onFinish(ITestContext context) {
	
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
