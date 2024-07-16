package com.tect.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class T {

	public static void main(String[] args) throws InterruptedException {
		int t3= 1000;
          WebDriver d = new ChromeDriver();
          d.manage().window().maximize();
          d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
          d.get("http://192.168.230.128:8080/crm/ShowHomePage.do");        Thread.sleep(t3);
          d.findElement(By.id("userName")).sendKeys("rashmi@dell.com");    Thread.sleep(t3);
          d.findElement(By.id("passWord")).sendKeys("123456"+Keys.ENTER);   Thread.sleep(t3);     
          d.findElement(By.linkText("Campaigns")).click();                 Thread.sleep(t3);
          d.findElement(By.xpath("//input[@value='New Campaign']")).click();    Thread.sleep(t3);
          d.findElement(By.name("property(Campaign Name)")).sendKeys("canon");   Thread.sleep(t3);
          d.findElement(By.name("property(Start Date)")).sendKeys("07/13/2024");   Thread.sleep(t3);
          d.findElement(By.name("property(Expected Revenue)")).sendKeys("12000000");  Thread.sleep(t3);
          d.findElement(By.name("property(Actual Cost)")).sendKeys("1000000");   Thread.sleep(t3);
          d.findElement(By.name("property(Num sent)")).sendKeys("20");    Thread.sleep(t3);
                 WebElement t=d.findElement(By.name("property(Type)"));   Thread.sleep(t3);
                     Select s1 = new Select(t);
                     s1.selectByVisibleText("Advertisement");        Thread.sleep(t3);
            WebElement   t1=d.findElement(By.name("property(Status)"));     Thread.sleep(t3);
                     Select s2 = new Select(t1);                               Thread.sleep(t3);
                     s2.selectByVisibleText("Active");                     Thread.sleep(t3);
                     d.findElement(By.name("property(End Date)")).sendKeys("07/20/2024"); Thread.sleep(t3);
                     d.findElement(By.name("property(Budgeted Cost)")).sendKeys("200000");  Thread.sleep(t3);
                     d.findElement(By.name("property(Expected Response)")).sendKeys("150"); Thread.sleep(t3);
     d.findElement(By.name("property(Description)")).sendKeys("canon is the high pixel camera in the world");Thread.sleep(t3);
                     d.findElement(By.xpath("//input[@value='Save & New']")).click();
                     
         
	}

}
