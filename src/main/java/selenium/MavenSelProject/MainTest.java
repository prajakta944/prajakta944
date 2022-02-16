package selenium.MavenSelProject;

import org.testng.annotations.Test;

public class MainTest {

	@Test // (enabled = false)
	public void MainTest1() {
		System.out.println("MainTest1");
	}

	@Test
	public void MainTest2() {
		System.out.println("MainTest2");
	}

	@Test //(groups = "Smoke Testing")
	public void MainTest3() {
		System.out.println("MainTest3");
	}

//	@Parameters({ "URL" })
//	@Test
//	public void IsDisplayTest() {
////		Checkbox c = new Checkbox(URL);
////		Assert.assertEquals(c.Isdisplay(), true);
//		System.out.println("main1test");
//	}
//
}
