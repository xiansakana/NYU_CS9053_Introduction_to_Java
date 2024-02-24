package exceptions;

public class AssertionDemo {

	public static void main(String[] args) {
		// you need to include the -ea flag for java to get this to work
		int i; int sum = 0;
		for (i = 0;i < 10;i++) {
			sum+= i;
			i += 100;
		}
		assert i == 10;
	}

}
