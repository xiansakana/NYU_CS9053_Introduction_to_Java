package shapes;

public class Circle extends GeometricObject {
	private double radius = 1.0;
	
	public Circle() {
		this.radius = 1.0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	
	public double getPerimeter() {
		return Math.PI*2*this.radius;
	}
	
	public double getDiameter() {
		return 2*this.radius;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Circle) {
			if (super.equals(o)) {
				Circle c = (Circle)o;
				if (this.radius == c.radius) {
					return true;
				}
			}
		}
		return false;
	}
	
	public String toString() {
		// the output of "A Circle with radius=xxx, which is a subclass of yyy", 
		// where yyy is the output of the toString() method from the superclass
		// is also acceptable
		return "Circle[" + super.toString() + ", radius=" + this.radius + "]";
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(c1.toString());
		System.out.println("color = " + c1.getColor());
		System.out.println("radius = " + c1.getRadius());
		System.out.println("area = " + c1.getArea());
		System.out.println("perimeter = " + c1.getPerimeter());
		

		Circle c2 = new Circle(3.5);
		System.out.println(c2.toString());
		
		Circle c3 = new Circle(2.5, "magenta", false);
		System.out.println(c3.toString());
		Circle c4 = new Circle(3.5);
		System.out.println("c2.equals(c4)? " + 
		c2.equals(c4));
		System.out.println("c2.equals(any geometricObject)? " + 
		c2.equals(new GeometricObject()));
	}

}
