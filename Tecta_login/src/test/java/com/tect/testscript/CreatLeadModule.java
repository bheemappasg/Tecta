package com.tect.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tect.generic.BaseClass;
import com.tecta.pom.Lead;

public class CreatLeadModule extends BaseClass

{
    @Test
    public void creatLeadModule() throws InterruptedException
    {
    	Reporter.log("creatLeadModule",true);
    	Lead l= new Lead(d);
    	l.setLead();
    	l.dropdown("Mr.");
    	l.setLead1();
    	l.dropdown2("Partner");
    	l.dropdown3("ERP");
    	l.setLead2();
    	l.dropdown4("Contacted");
    	l.setLead3();
    	l.dropdown5("Active");
    	l.setLead4();
    
    }
}
