package wrapper;

import java.util.Arrays;

public class WrapperClasses {

	public static void main(String[] args) {
		int i = 8;
		Integer myInteger;
		myInteger = new Integer(5);
		myInteger = 15;
		Integer[] intArray = {i, myInteger, 34, 88, 27 };
		Integer newInt = myInteger + 66;
		System.out.println("newInt is  "+ newInt);
		String myArg = "55";
		Integer j = Integer.parseInt(myArg);
		byte b = newInt.byteValue();
		
		Integer g = 55;
		System.out.println("g == j ? " + (g == j));

		Integer h = 55;
		System.out.println("g == h ? " + (g == h));
		 j = new Integer(999);
		Integer k = new Integer(999);
		System.out.println((j == k));
		System.out.println("j == k ? " + (j == k));
		System.out.println("j. equals(k)? " +j.equals(k));
		String s = "55 892 547 23 5 43";
		String[] numbers = s.split(" ");
		Integer[] myInts = new Integer[6];
		for (int a=0;a < numbers.length;a++) {
			myInts[a] = Integer.parseInt(numbers[a]);
		}
		System.out.println(Arrays.toString(myInts));
	}
	

}
