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
		String s8 = "Hel" + "lo";
		System.out.println("s1.equals(s2) ? " + s1.equals(s2));
		System.out.println("s1.equals(s3) ? " + s1.equals(s3));
		System.out.println("s1 == s3? " + (s1 == s3));
		System.out.println("s3 == s4? " + (s3 == s4));
		System.out.println("s8 == s1? " + (s8 == s1));
		System.out.println("s7 == s1? " + (s7 == s1));
		
		
		
	}
}
