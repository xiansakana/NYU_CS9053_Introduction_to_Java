package polymorphism_binding;
import java.util.ArrayList;
import java.util.Collections;

import People.Employee;
import People.Faculty;
import People.Person;
import shapes.*;

public class PolymorphismDemo {
	  /** Main method */
	  public static void main(String[] args) {
	    // Display circle and rectangle properties
		  GeometricObject go = new Circle
			        (1, "red", false);
		  //Object o1 = new Faculty();
		  //Employee e = (Employee)o1;
		  //System.out.println(e);
	    displayObject(go);
	    displayObject(new Rectangle
	        (1, 1, "black", true));
	    displayObject(new Square
		        (5 , "blue", true));
	    
	    ArrayList<GeometricObject> gol = new ArrayList<>();
	    gol.add(new Circle());
	    gol.add(new Square());
	    gol.add(new Rectangle(5,3));
	    gol.add(new Circle(5.3));
	    Collections.shuffle(gol);
	    displayAllObjects(gol);
	  }

	  /** Display geometric object properties */
	  public static void displayObject(GeometricObject object) {
	    System.out.println("Created on " + object.getDateCreated() +
	      ". Color is " + object.getColor());
	    if (object instanceof Circle) {
	    	Circle c = (Circle)object;
	    	System.out.println("circle has radius " + c.getRadius() + 
	    			" and area of  "+ c.getArea());
	    } else if (object instanceof Rectangle) {
	    	Rectangle r = (Rectangle)object;
	    	System.out.println("rectangle has width of " + r.getWidth() + " and height of " +
	    	r.getLength() + " and area of "+ r.getArea());
	    	
	    }
	    System.out.println(object.toString());
	  }
	  
	  public static void displayAllObjects(ArrayList<GeometricObject> al) {
		  for (GeometricObject go: al) {
			  System.out.println(go.toString());
		  }
	  }
	}
