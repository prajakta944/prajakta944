package selenium.MavenSelProject;

import org.apache.logging.log4j.*;

public class LoggerDemo {

	private static Logger log = LogManager.getLogger(LoggerDemo.class.getName());

	public static void main(String[] args) {

		log.debug("This is debug");
		log.error("This is error");
		log.info("This is info");
		log.fatal("This is fatal");
	}

}
