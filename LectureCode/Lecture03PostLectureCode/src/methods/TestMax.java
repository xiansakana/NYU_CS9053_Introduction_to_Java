package methods;

public class TestMax {
	  /** Main method */
	  public static void main(String[] args) {
	    int i = 5;
	    int j = 2;
	    int k = max(i, j); // Invoke max method
	    System.out.println("The maximum between " + i +
	      " and " + j + " is " + k);
	    
	    double m = 5.5;
	    double n = 8.3;
	    double p = max(m,n);
	    System.out.println("The maximum between " + m +
	  	      " and " + n+ " is " + p);
	  }

	  /** Return the max between two numbers */
	  public static int max(int num1, int num2) {
		  /* this is a method that doesn't require the
		   * creation of a class!
		   */
		  int result;

	    if (num1 > num2)
	      result = num1;
	    else
	      result = num2;

	    return result; // Return result
	  }
	  
	  public static double max(double num1, double num2) {
		  /* this is a method that doesn't require the
		   * creation of a class!
		   */
		  double result;

	    if (num1 > num2)
	      result = num1;
	    else
	      result = num2;

	    return result; // Return result
	  }
	}