package classes;

public class TestTV {  
  public static void main(String[] args) {
    TV tv1 = new TV(); // Create a TV
    tv1.turnOn(); // Turn on tv1
    tv1.setChannel(30);
   // tv1.channel = 500;
    tv1.setVolume(3);
    
    TV tv2 = new TV();
    tv2.turnOn();
    tv2.channelUp();
    tv2.channelUp();
    tv2.volumeUp(); // Increase tv2 volume up 1 level
    
    System.out.println("tv1's channel is " + tv1.getChannel() 
      + " and volume level is " + tv1.getVolumeLevel());
    System.out.println("tv2's channel is " + tv2.getChannel() 
      + " and volume level is " + tv2.getVolumeLevel());
  }
}