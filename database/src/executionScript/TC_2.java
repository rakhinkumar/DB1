package executionScript;
import org.testng.annotations.Test;

import automationLibrary.dblogin;
import testBase.webDriver;
public class TC_2 extends webDriver {
	@Test
	public void readDb () throws Exception
	{
		dblogin.getInstance().readDb();
		Thread.sleep(1000);
	}

}
