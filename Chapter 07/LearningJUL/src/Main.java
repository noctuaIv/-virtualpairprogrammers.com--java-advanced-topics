import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	
	static Logger logger = Logger.getGlobal();

	public static void main(String[] args) {
		
		logger.log(Level.SEVERE, "Severe event");
		AnotherClass ac = new AnotherClass();
		ac.testMethod();

	}

}