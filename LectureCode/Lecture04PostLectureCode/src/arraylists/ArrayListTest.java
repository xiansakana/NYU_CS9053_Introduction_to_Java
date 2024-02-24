package arraylists;

import java.util.ArrayList;

import shapes.Circle;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> arInts =new ArrayList<Integer>();
		arInts.add(5);
		arInts.add(593);
		System.out.println(arInts.toString());
		for (int i=0;i<30;i++) {
			arInts.add((int)(Math.random()*500));
		}
		System.out.println(arInts.toString());
		ArrayList<Object> arObj =new ArrayList<Object>();
		for (int i=0;i<arInts.size();i++) {
			arObj.add(arInts.get(i));
		}
		arObj.add("Hello");
		arObj.add(new Circle());
		System.out.println(arObj.toString());
		
	}
}
