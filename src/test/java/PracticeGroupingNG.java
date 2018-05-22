import org.testng.annotations.Test;

public class PracticeGroupingNG {
	@Test (groups = {"Car"})
	public void CarTest1() {
		System.out.println("Grouping Car Test-1");
	}

	@Test (groups = {"Jeep"})
	public void JeepTest1() {
		System.out.println("Grouping Jeep Test-1");
	}

	@Test (groups = {"Car", "Sedan Car"})
	public void SedanCarTest1() {
		System.out.println("Sedan Car Test-1");
	}

}
