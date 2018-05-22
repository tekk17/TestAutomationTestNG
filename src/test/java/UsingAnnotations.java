import org.testng.annotations.*;

public class UsingAnnotations {
	@Test
	public void SecondTest1() {
		System.out.println("This is testcase-1");
	}

	@Test
	public void SecondTest2() {
		System.out.println("This is testcase-2");
	}

	@BeforeMethod
	public void SecondTestBeforeMethod() {
		System.out.println("This will execute before every method");
	}

	@AfterMethod
	public void SecondTestAfterMethod() {
		System.out.println("This will execute after every method");
	}

	@BeforeClass
	public void SecondTestBeforeClass() {
		System.out.println("This will execute before every class");
	}

	@AfterClass
	public void SecondTestAfterClass() {
		System.out.println("This will execute after every class");
	}

	@BeforeTest
	public void SecondTestBeforeTest() {
		System.out.println("This will execute before the test");
	}

	@AfterTest
	public void SecondTestAfterTest() {
		System.out.println("This will execute after the test");
	}

	@BeforeSuite
	public void SecondTestBeforeSuite() {
		System.out.println("This will execute before the Test suite");
	}

	@AfterSuite
	public void SecondTestAfterSuite() {
		System.out.println("This will execute after the Test suite");
	}
}
