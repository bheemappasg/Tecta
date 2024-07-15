package com.tect.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	public static WebDriver d;
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("openbrowser",true);
		d= new chromedriver();
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
	public void login()
	Reporter.log("login",true);
	d.get("");
	FileLib f = new FileLib();
	d.findElement(By.)
	d.findElement(By.));
	d.findElement(By.)
}
@AfterMethod
public void logout() {
	Reporter.log("logout",true);
	d.findElement(By)
			
	}

}