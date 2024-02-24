import java.util.*;

public class ComputeArea {
	/** Main method */

	public static void main(String[] args) {
	    double radius;
	    double area;
    
	    Scanner consoleInput = new Scanner(System.in);
	    System.out.print("Input radius: ");
	    // Assign a radius
	    radius = consoleInput.nextDouble();

	    // Compute area
	    area = radius * radius * 3.14159;

	    // Display results
	    System.out.println("The area for the circle of radius " +
	    		radius + " is " + area);
	}

}
