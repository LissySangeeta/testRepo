package pipetest;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class minimalsanity {
	private WebDriver driver;
	
	@BeforeClass
	public void init()
	{
		driver = new FirefoxDriver();
		driver.get("www.google.com");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testgooglename()
	{
		try {
			driver.wait(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals("www.google.com", driver.getCurrentUrl());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testgmailname()
	{
		try {
			driver.wait(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals("www.gmail.com", driver.getCurrentUrl());
	}

}
