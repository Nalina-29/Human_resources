package practice;

import org.testng.annotations.Test;

public class HrOfficerTest {
	@Test
	public void addbranch()
	{
		System.out.println("add the branch");
	}

	@Test(groups = "smoke")
	public void Addcorporate()
	{
		System.out.println("Add the corporate");
	}
	@Test
	public void Addpatient()
	{
		System.out.println("Add the Patient");
	}
}
