package practice;

import org.testng.annotations.Test;

public class HrheadTest {
	@Test(groups = "Smoke")
	public void addadmin()
	{
		System.out.println("-- add admin --");
	}

	@Test(groups="Smoke")
	public void addempl()
	{
		System.out.println("-- add Employee --");
	}

}
