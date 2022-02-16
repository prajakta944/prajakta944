package selenium.MavenSelProject;

import org.testng.annotations.Test;

public class TestTest {

	@Test // (timeOut = 4000)
	public void TestTest1() {
		System.out.println("TestTest1");
	}

	@Test //(groups = "Smoke Testing")
	public void TestTest2() {
		System.out.println("TestTest2");
	}

	@Test
	public void TestTest3() {
		System.out.println("TestTest3");
	}

//	@Parameters({ "URL" })
//	@Test
//	public void IsDisplayTest() {
////		Checkbox c = new Checkbox(URL);
////		Assert.assertEquals(c.Isdisplay(), true);
//		System.out.println("test1test");
//	}

}
