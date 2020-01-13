package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {
	@Test(groups= {"calls"})
public void calls()
{
	Reporter.log("calls",true);
}

	@Test
public void status()
{
	Reporter.log("status",true);
}

	@Test
public void chats()
{
	Reporter.log("chats",true);
}
	

}
