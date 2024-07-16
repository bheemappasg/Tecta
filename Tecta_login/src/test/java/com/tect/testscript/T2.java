package com.tect.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2 {

	public static void main(String[] args) {
        WebDriver d =new ChromeDriver();
        d.findElement(By.linkText("canon")).click();
        d.findElement(By.xpath("//input[@value='New Task']"));
        
        
           
	}

}
