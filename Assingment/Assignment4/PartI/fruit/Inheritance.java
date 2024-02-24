package fruit;

public class Inheritance {

	public static void main(String[] args) {
		// Here's some scratch space to experiment/debug your Fruit objects
	    m(new Fruit());
	    m(new Apple("good", "nice", "red", false));
	    m(new Citrus());
	    m(new Orange("insecure", "medium", false));
	    m(new Lemon(10, "terrible", true));
	}
	
	public static void m(Object o) {
	    System.out.println(o.toString());
	  }
}


class Fruit{
    private String color;
	private boolean rotten;	
	private static int next_id = 1;
    private int id;

	public Fruit() {	
	}
    
    public Fruit(String color, boolean rotten) {
        this.id = next_id++;
        this.color = color;
        this.rotten = rotten;
    }

	public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
    	this.color = color;
    }
    
    public boolean isRotten() {
        return rotten;
    }
    
    public void setRotton(boolean rotten) {
    	this.rotten = rotten;
    }
    
    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", color=" + color + 
                ", rotten=" + rotten +
                "} ";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Fruit)) return false;
        Fruit fruit = (Fruit) obj;
        return id == fruit.id && color.equals(fruit.color) && rotten == fruit.rotten;
    }
}

class Apple extends Fruit{
	private String taste;
	private String texture;
	
	public Apple(){
		
	}
	
	public Apple(String taste, String texture, String color, boolean rotten) {
		
		super(color, rotten);
		this.taste = taste;
		this.texture = texture;
	}
	
	public String getTaste() {
		return taste;
	}
	
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	public String getTexture() {
		return texture;
	}
	
	public void setTexture(String texture) {
		this.texture = texture;
	}
	
	@Override
    public String toString() {
        return super.toString() + "Apple{" +
                "taste=" + taste +
                ", texture=" + texture +
                "} ";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Apple)) return false;
        Apple apple = (Apple) obj;
        return taste.equals(apple.taste) && texture.equals(apple.texture);
    }
}


  
class Citrus extends Fruit{
	private String taste;
	
	public Citrus(){
		
	}
	
	public Citrus(String taste, String color, boolean rotten) {
		super(color, rotten);
		this.taste = taste;
	}
	
	public String getTaste() {
		return taste;
	}
	
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	@Override
    public String toString() {
        return super.toString() + "Citrus{" +
                "taste=" + taste +
                "} ";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Citrus)) return false;
        Citrus citrus = (Citrus) obj;
        return taste.equals(citrus.taste);
    }
}

class Lemon extends Citrus{
	private int sourness;
	
	public Lemon() {
		
	}
	
	public Lemon(int sourness, String taste, boolean rotten) {
		super(taste, "yellow", rotten);
		this.setSourness(sourness);
	}

	public int getSourness() {
		return sourness;
	}

	public void setSourness(int sourness) {
		this.sourness = sourness;
	}

	@Override
    public String toString() {
        return super.toString() + "Lemon{" +
                "sourness=" + sourness +
                "} ";
    }
    
	@Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Lemon)) return false;
        Lemon lemon = (Lemon) obj;
        return sourness == lemon.sourness;
    }
}

class Orange extends Citrus{
	private String type;
	
	public Orange() {
		
	}
	
	public Orange(String type, String taste, boolean rotten) {
		super(taste, "orange", rotten);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
    public String toString() {
        return super.toString() + "Orange{" +
                "type=" + type +
                "} ";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Orange)) return false;
        Orange orange = (Orange) obj;
        return type.equals(orange.type);
    }
}
