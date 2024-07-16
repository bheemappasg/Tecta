package com.tect.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.tecta.pom.loginPage;

public class BaseClass {
	public static WebDriver d;
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("openbrowser",true);
		d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("closebrowser",true);
		d.close();
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
	Reporter.log("login",true);Thread.sleep(1000);
	d.get("http://192.168.230.128:8080/crm/ShowHomePage.do");
	//FileLib f = new FileLib();
	//String s = f.getPropertyData("un");
   // String s1 = f.getPropertyData("pw");
   // String s2 = f.getPropertyData("url");
               Thread.sleep(1000);
               loginPage l=new loginPage(d);
               Thread.sleep(1000);
               l.setlogin("rashmi@dell.com", "123456");
   
}
@AfterMethod
public void logout() throws InterruptedException {
	Reporter.log("logout",true);
	Thread.sleep(5000);
d.close();
			
	}

}