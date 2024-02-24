
public class SquarePyramid {
    private static int nextId = 1;
    private int id;
    private double side;
    private double height;

    public SquarePyramid() {
        this(1.0, 1.0);
    }
    
    public SquarePyramid(double side, double height) {
        this.side = side;
        this.height = height;
        this.id = nextId++;
    }

    public double getSide() {
        return side;
    }
    
    public void setSide(double height) {
    	this.height = height;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
    	this.height = height;
    }
    
    public double getVolume() {
        return (side * side * height) / 3;
    }

    public double getSurfaceArea() {
        double slantHeight = Math.sqrt((side / 2) * (side / 2) + height * height);
        double baseArea = side * side;
        double lateralArea = 2 * side * slantHeight;
        return baseArea + lateralArea;
    }

    public int getID() {
        return id;
    }



}
