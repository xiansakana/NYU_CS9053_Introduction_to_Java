package strings;

public class StringPool {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Goodbye";
		String s3 = "Hello";
		String s4 = new String("Hello");
		String s5 = "Hel"
				;
		String s6 = "lo";
		String s7 = s5 + s6;		
		
		System.out.println("s1.equals(s2) ? " + s1.equals(s2));
		System.out.println("s1.equals(s3) ? " + s1.equals(s3));
		System.out.println("s1 == s3? " + s1 == s3);
		
		
	}
}
