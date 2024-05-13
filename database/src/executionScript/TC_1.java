package executionScript;

import org.testng.annotations.Test;

import automationLibrary.dblogin;
import testBase.webDriver;

public class TC_1 extends webDriver{
	@Test
	public void LaunchWebConfig() throws Exception
	{
		dblogin.getInstance().LaunchWebExcel();
		Thread.sleep(1000);
	}

}
