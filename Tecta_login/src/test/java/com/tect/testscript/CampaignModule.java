package com.tect.testscript;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tect.generic.BaseClass;
import com.tect.generic.FileLib;
import com.tecta.pom.Compaign;
import com.tecta.pom.loginPage;

public class CampaignModule extends BaseClass 
     
{
    @Test
    public void CreateCampaign() throws IOException, InterruptedException
    {
    	Reporter.log("CreateCustemer",true);
    	//FileLib f= new FileLib();
    	//String t1 = f.getPropertyData("un");
    	//String t2 = f.getPropertyData("pw");
    	
    	//loginPage l= new loginPage(d);
    	//l.setLogin(t1, t2);
    	
    	Compaign C = new Compaign(d);
    	Thread.sleep(1000);
    	C.setcampaign();
    	Thread.sleep(1000);
    	C.setcampainName();
    	Thread.sleep(1000);
    	
    	C.DropDown("Advertisement");
    	Thread.sleep(1000);
    	C.DropDown1("Active");
    	 
    	C.Enddate();
    	
    
  
    }
}
