package com.tecta.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Lead {
	@FindBy(linkText="Leads")
	private WebElement lead;
  
	@FindBy(xpath="//input[@value='New Lead']")
	private WebElement newlead;
	
	@FindBy(xpath="//select[@name='property(saltName)']")
	private WebElement Mr1;
	
	@FindBy(name="property(First Name)")
	private WebElement Namefield;
	
	@FindBy(name="property(Designation)")
	private WebElement Design;
	
	@FindBy(name="property(Phone)")
	private WebElement Phone;
	
	@FindBy(name="property(Mobile)")
	private WebElement Mobile;
	
	@FindBy(name="property(Lead Source)")
	private WebElement leadSource;
	
	@FindBy(name="property(Industry)")
	private WebElement industry;
	
	@FindBy(name="property(Annual Revenue)")
	private WebElement AnualReve;
	
	@FindBy(id="Campaign Source")
	private WebElement camp;
	
	@FindBy(name="property(Company)")
	private WebElement companyN;
	
	@FindBy(name="property(Last Name)")
	private WebElement LastN;
	
	@FindBy(name="property(Email)")
	private WebElement Email;
	
	@FindBy(name="property(Fax)")
	private WebElement Fax;
	
	@FindBy(name="property(Website)")
	private WebElement Website;
	
	@FindBy(name="property(Lead Status)")
	private WebElement leadstatus;
	
	@FindBy(name="property(No of Employees)")
	private WebElement emp;
	
	@FindBy(name="property(Rating)")
	private WebElement Rating;
	
	@FindBy(name="property(Street)")
	private WebElement Street;
	
	@FindBy(name="property(State)")
	private WebElement State;
	
	@FindBy(name="property(Country)")
	private WebElement Country;
	
	@FindBy(name="property(City)")
	private WebElement City;
	
	@FindBy(name="property(Zip Code)")
	private WebElement Code;
	
	@FindBy(name="property(Description)")
	private WebElement Descriop;
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement Save;
	
	public Lead(WebDriver d)
	{
		PageFactory.initElements(d,this);
	}
	public void dropdown(String visible) throws InterruptedException
	{
		Thread.sleep(1000);
		Select s= new Select(Mr1);
		s.selectByVisibleText(visible);
	}
	public void dropdown2(String visible2)
	{
		Select s1=new Select(leadSource);
		s1.selectByVisibleText(visible2);
	}
	public void dropdown3(String visible3)
	{
		Select s1=new Select(industry);
		s1.selectByVisibleText(visible3);
	}
	public void dropdown4(String visible4)
	{
		Select s1=new Select(leadstatus);
		s1.selectByVisibleText(visible4);
	}
	public void dropdown5(String visible5)
	{
		Select s1=new Select(Rating);
		s1.selectByVisibleText(visible5);
	}
	//public void setLead(String l1,String l2,String l3)
	public void setLead() throws InterruptedException
	{
		Thread.sleep(1000);
		lead.click();
		Thread.sleep(1000);
		newlead.click();
	}
	public void setLead1()
	{
		Namefield.sendKeys("Virat");
		Design.sendKeys("Cricketer");
		Phone.sendKeys("080-180076");
		Mobile.sendKeys("9745778789");
	}
	//public void setLead2(String m1,String m2,String m3,String m4,String m5,String m6)
	public void setLead2()
	{
		AnualReve.sendKeys("1000000");
		camp.sendKeys("adds");
		companyN.sendKeys("TCS");
		LastN.sendKeys("kohli");
		Email.sendKeys("viratkohli123@gmail.com");
		 Fax.sendKeys("677");
		 Website.sendKeys("www.cricbuz.com");
	}
	public void setLead3()
	{
		emp.sendKeys("100");
	}
	//public void setLead3(String n1,String n2,String n3,String n4,String n5,String n6,String n7)
	public void setLead4()
	{
		Street.sendKeys("SreeNagar");
		State.sendKeys("Delhi");
		Country.sendKeys("India");
		City.sendKeys("Delhi");
		 Code.sendKeys("520097");
		 Descriop.sendKeys("kohli is best batsman in the world");
		 Save.click();
	}
	
	
}
