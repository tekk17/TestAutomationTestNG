import org.testng.annotations.Test;

public class DependentTest {
	@Test (dependsOnMethods = {"OpenBrowser"})
	public void SignInToApp() {
		System.out.println("I am executing after OpenBrowser");
	}

	@Test
	public void OpenBrowser() {
		System.out.println("Browser has been opened");
	}

	@Test (dependsOnMethods = {"SignInToApp"})
	public void CloseBrowser() {
		System.out.println("I am executing after Sign In To App Is Complete");
	}
}
