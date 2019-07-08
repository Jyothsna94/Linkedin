package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Drivers.Classa;
import properties.Classb;


public class Classc extends Classa {
		Classb page;
		@BeforeClass
		  public void beforeClass() {
			  browserLaunch("CHROME", "https://www.linkedin.com/uas/login");
		  }
		@Test
		public void registration() throws Exception
		  { 
			page=new Classb(driver);
		  page.UserLogin();
	  }
		  }