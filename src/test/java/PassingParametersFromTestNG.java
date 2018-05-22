import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassingParametersFromTestNG {
	@Test
	@Parameters ({"Number1", "Number2"})
	public void usingParametersToCompute(int Number1, int Number2) {
		int result = Number1 + Number2;

		System.out.println("Result: " + result);
	}
}
