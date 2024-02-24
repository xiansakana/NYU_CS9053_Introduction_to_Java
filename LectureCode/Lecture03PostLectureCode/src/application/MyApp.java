package application;

import classes.TV;

public class MyApp {

	public static void main(String[] args) {
		TV tv1 = new TV(); // Create a TV
	    tv1.turnOn(); // Turn on tv1
	    tv1.setChannel(30);
	    //tv1.channel = 500;
	    tv1.setVolume(3);
	}

}
