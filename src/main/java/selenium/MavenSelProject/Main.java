package selenium.MavenSelProject;

import org.testng.annotations.Test;

public class Main {

	@Test // (dependsOnMethods = { "Main3", "Main2" })
	public void Main1() {
		System.out.println("Main1");
	}

	@Test //(groups = "Smoke Testing")
	public void Main2() {
		System.out.println("Main2");
	}

	@Test
	public void Main3() {
		System.out.println("Main3");
	}

//	@Parameters({ "URL" })
//	@Test
//	public void IsDisplayTest() {
////		Checkbox c = new Checkbox(URL);
////		Assert.assertEquals(c.Isdisplay(), true);
//		System.out.println("main2");
//	}

}
