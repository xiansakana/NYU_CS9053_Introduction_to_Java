package classes;

public class TestStudent {

	public static void main(String[] args) {
		Student student = new Student("John Doe", 25, true, 'M', null);
	    System.out.println("name? " + student.getName()); 
	    System.out.println("age? " + student.getAge()); 
	    System.out.println("isScienceMajor? " + student.isScienceMajor()); 
	    System.out.println("gender? " + student.getGender()); 
	    
	    /**
	     * 
	     * int x; // x has no default value
    		String y; // y has no default value
    	System.out.println("x is " + x); 
    	System.out.println("y is " + y); 

	     * 
	     */
	}

}
