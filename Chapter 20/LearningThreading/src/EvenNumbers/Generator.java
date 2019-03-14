package EvenNumbers;

public class Generator {

	public static void main(String[] args) {

		EvenNumberHolder evenNumberHolder = new EvenNumberHolder();
		EvenTask task = new EvenTask(evenNumberHolder);
		
		for (int i = 0; i < 15 ; i++) {
			new Thread(task).start();
		}

	}

}
