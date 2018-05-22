import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNG {
	@Test
	public static void doingThis() {
		System.out.println("I am in here!");
		return;
	}

	@BeforeMethod
	public static void beforeDoingThat() {
		System.out.println("I am doing this before test");
	}

	@AfterMethod
	public static void afterDoingThat() {
		System.out.println("I am doing this after test");
	}
}
