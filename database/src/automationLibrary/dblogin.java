package automationLibrary;

import org.openqa.selenium.By;

import settings.Settings;
import testBase.webDriver;
import testdata.tableData;

public class dblogin extends webDriver{
	Settings se= new Settings();
	public static dblogin cha =null;
	public static dblogin getInstance() throws Exception {
		try {
			if (cha==null) {
				cha=new dblogin();
			}
		}
		catch (Exception e) {
			throw new Exception("Exception while Initializing TestBase.,e");
		}
		return cha;
			}
	public void LaunchWebExcel () throws Exception
	{
		String URL = se.getProperty("webURL");
		driver.get(URL);
		Thread.sleep(4000);
	}
	public void readDb () throws Exception
	{
		String fname[]=tableData.getInstance().retrieveDBValue("obj1");
		System.out.println("checkiing firstnamein dblogin.java"+fname[0]);
		driver.findElement(By.id(fname[0])).sendKeys(fname[1]);
		String fname1[] =tableData.getInstance().retrieveDBValue("obj2");
		System.out.println("checking firstname in dblogin.java"+fname1[1]);
		driver.findElement(By.name(fname1[0])).sendKeys(fname1[1]);
		}
	}


