import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class AnotherClass {

	static Logger logger = LogManager.getLogger();
	
	public void testMethod() {
		logger.log(Level.FATAL, "fatal event");
		logger.log(Level.INFO, "info event");
	}
}
