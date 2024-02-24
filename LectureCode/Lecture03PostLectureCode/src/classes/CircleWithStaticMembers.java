package classes;


public class CircleWithStaticMembers {
	  /** The radius of the circle */
	  double radius;
	  int id;

	  /** The number of the objects created */
	  static int numberOfObjects = 0;

	  /** Construct a circle with radius 1 */
	  CircleWithStaticMembers() {
		  id = numberOfObjects;
	    radius = 1.0;
	    numberOfObjects++;
	  }

	  /** Construct a circle with a specified radius */
	  CircleWithStaticMembers(double newRadius) {
		  id = numberOfObjects;
	    radius = newRadius;
	    numberOfObjects++;
	  }

	  /** Return numberOfObjects */
	  static int getNumberOfObjects() {
	    return numberOfObjects;
	  }

	  /** Return the area of this circle */
	  double getArea() {
	    return radius * radius * Math.PI;
	  }
	}