package practice;

import org.testng.annotations.Test;

public class HrheadTest {
	@Test(groups = "smoke")
	public void addadmin()
	{
		System.out.println("-- add admin --");
	}

	@Test
	public void addempl()
	{
		System.out.println("-- add Employee --");
	}

}
