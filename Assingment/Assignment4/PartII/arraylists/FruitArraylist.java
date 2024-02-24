package arraylists;
import java.util.ArrayList;
import java.util.Random;


public class FruitArraylist {

	public static void main(String[] args) {
		
		// this ArrayList MUST be parameterized
//		ArrayList fruitArrayList;
		ArrayList<Fruit> fruitArrayList = new ArrayList<>();

		// 1 non-rotten red Apple with a crisp texture and sweet taste
		fruitArrayList.add(new Apple("sweet", "crisp", "red", false));

		// 2 rotten green Apples with a soft texture and tart taste
		fruitArrayList.add(new Apple("tart", "soft", "green", true));
		fruitArrayList.add(new Apple("tart", "soft", "green", true));

		// 3 non-rotten Lemons with random sourness
		Random rand = new Random();
		fruitArrayList.add(new Lemon(rand.nextInt(101), "sour", false));
		fruitArrayList.add(new Lemon(rand.nextInt(101), "sour", false));
		fruitArrayList.add(new Lemon(rand.nextInt(101), "sour", false));

		// 2 rotten Oranges of type “mandarin” with a sweet taste
		fruitArrayList.add(new Orange("mandarin", "sweet", true));
		fruitArrayList.add(new Orange("mandarin", "sweet", true));

		// Print the average sourness of Lemon objects
		int totalSourness = 0;
		int lemonCount = 0;
		for (Fruit fruit : fruitArrayList) {
		    if (fruit instanceof Lemon) {
		        Lemon lemon = (Lemon) fruit;
		        totalSourness += lemon.getSourness();
		        lemonCount++;
		    }
		}
		if (lemonCount > 0) {
		    System.out.println("Average sourness of Lemons: " + (totalSourness / lemonCount));
		} else {
		    System.out.println("No Lemons in the list.");
		}

		
		// this is the variable you should retain to compare
		// to the other objects in the arraylist
		Apple rottenGreenApple = (Apple) fruitArrayList.get(1); // 1st rotten green Apple

		// Print matching and same objects
		for (Fruit fruit : fruitArrayList) {
		    if (fruit.equals(rottenGreenApple)) {
		        System.out.println(fruit.toString() + " is equal to the rotten green Apple.");
		    }
		    if (fruit == rottenGreenApple) {
		        System.out.println(fruit.toString() + " is the same object as the rotten green Apple.");
		    }
		}

		// Remove matching objects
		fruitArrayList.removeIf(fruit -> fruit instanceof Apple && fruit.equals(rottenGreenApple));
		
		// Print out the remaining objects
		System.out.println("The remaining objects:");
		for (Fruit fruit : fruitArrayList) {
		    System.out.println(fruit.toString());
		}

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
        return color.equals(fruit.color) && rotten == fruit.rotten;
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