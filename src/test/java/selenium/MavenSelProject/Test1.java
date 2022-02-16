package selenium.MavenSelProject;

import org.testng.annotations.Test;

public class Test1 {

	@Test // (dependsOnMethods = { "Test13" })
	public void Test11() {
		System.out.println("Test11");
	}

	//GIT new line add and commit the same
	// GIT new line add and commit the same
	// GIT new line add and commit the same
	// GIT new line add and commit the same
	// GIT new line add and commit the same
	//qwertyu
	@Test
	public void Test12() {
		System.out.println("Test12");
	}

	@Test // (groups = "Smoke Testing")
	public void Test13() {
		System.out.println("Test13");
	}

//	@Parameters({ "URL" })
//	@Test
//	public void IsDisplayTest() {
//		Checkbox c = new Checkbox(URL);
//		Assert.assertEquals(c.Isdisplay(), true);
//		System.out.println("test2");
//	}

}
