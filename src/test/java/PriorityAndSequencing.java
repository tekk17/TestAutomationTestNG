import com.oracle.tools.packager.Log;
import log4jsample.MainLogger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import java.util.logging.Logger;

public class PriorityAndSequencing {
	//private static Logger MainLogger = Logger.getLogger(MainLogger.class.getName());

	@Test (priority = 0)
	public void priorityZero() {
		System.out.println("I will be executed first");
		log4jsample.MainLogger.startTestCase();
		log4jsample.MainLogger.info("Method with priority 0 executed");
		Reporter.log("Executing method with priority 0");
	}

	@Test (priority = 2)
	public void priorityTwo() {
		System.out.println("I will be executed second");
		log4jsample.MainLogger.warn("Second is being executed");
		Reporter.log("Executing method with priority 2");
	}

	@Test (priority = 1)
	public void priorityOneFalse() {
		System.out.println("I will not be executed");
		log4jsample.MainLogger.debug("Priority-1 is being executed");
		Reporter.log("Executing method with priority 1");
	}

	@Test (priority = 3)
	public void feedExceptionIntoLogs() {
		try {
			throw new Exception(new ExceptionInInitializerError());
		}catch (Exception e) {
			MainLogger.error("Exception in feedExceptionIntoLogs: " + e);
			log4jsample.MainLogger.endTestCase();
		}
	}
}
