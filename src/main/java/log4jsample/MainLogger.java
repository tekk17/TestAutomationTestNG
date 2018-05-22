package log4jsample;


import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.DOMConfigurator;

public class MainLogger {
	private static Logger MainLogger = Logger.getLogger(MainLogger.class.getName());
	public static FileAppender fileAppender = new FileAppender();

	public static void startTestCase() {
		DOMConfigurator.configure("log4j.xml");
		MainLogger.info("***************");
		MainLogger.info("Starting Testcase execution");
		fileAppender.setFile("logfile.log");
		fileAppender.setLayout(new SimpleLayout());
	}

	public static void endTestCase() {
		MainLogger.info("Finishing Testcase execution");
		MainLogger.info("*****************");
	}

	public static void info(String message) {
		MainLogger.info(message);
	}

	public static void warn(String message) {
		MainLogger.warn(message);
	}

	public static void debug(String message) {
		MainLogger.debug(message);
	}

	public static void error(String message) {
		MainLogger.error(message);
	}
}
