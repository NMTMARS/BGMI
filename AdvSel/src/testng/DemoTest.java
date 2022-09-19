package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest 
{
	@Test
	public void sample()
	{
		Reporter.log("Hello", false);
	}
}