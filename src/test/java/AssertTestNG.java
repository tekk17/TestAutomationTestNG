import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTestNG {
	@Test
	public void testAssertStatements() {
		String str = "Manchester United";
		Assert.assertEquals("Manchester United", str);

		boolean isTrue = true;
		Assert.assertTrue(isTrue);

		boolean isFalse = false;
		Assert.assertFalse(isFalse);
	}
}
