import java.util.logging.Level;
import java.util.logging.Logger;



public class AnotherClass {

	static Logger logger = Logger.getGlobal();
	
	public void testMethod() {
		logger.log(Level.FINER, "finer event");
		logger.log(Level.INFO, "info event");
	}
}