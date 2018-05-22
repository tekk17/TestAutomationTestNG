import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersTestNG {
	@DataProvider(name = "Numbers")
	public static Object[][] returnNumbers() {
		return new Object[][] {{"Shaun", "Pollock"}, {"Michael", "Clarke"}};
	}

	@Test(dataProvider = "Numbers")
	public void computeSum(String s1, String s2) {
		/*int result = 0;
		for(int i=0;i<4;i++) {
			result += number[i];
		}
		System.out.println(result);*/
		String s3 = s1 + " " + s2;
		System.out.println(s3);
	}

}
