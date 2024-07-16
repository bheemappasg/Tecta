package com.tecta.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	  @FindBy(id ="userName")
	   private WebElement untbx;
	    
	   @FindBy(id ="passWord")
	   private WebElement pwtbx;
	    
	   @FindBy(xpath="//input[@type='image']")
	   private WebElement lgbtn;
	    
	   public loginPage(WebDriver d)
	   {
		   PageFactory.initElements(d,this);
	   }
	   public void setlogin(String s1, String s2)
	   {
		   untbx.sendKeys(s1);
		   pwtbx.sendKeys(s2);
		   lgbtn.click();
}}
