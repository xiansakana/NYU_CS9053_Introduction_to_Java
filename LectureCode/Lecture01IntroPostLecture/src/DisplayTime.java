import java.util.Scanner;

public class DisplayTime {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Prompt the user for input
    System.out.print("Enter an integer for seconds: ");
    int seconds = input.nextInt();
 
    int minutes = seconds / 60; // Find minutes in seconds
    int hours = minutes / 60; // find the number of hours
    minutes = minutes % 60;
    int remainingSeconds = seconds % 60; // Seconds remaining
    System.out.println(seconds + " seconds is " + hours + 
    		" hours " + minutes + 
      " minutes and " + remainingSeconds + " seconds");  
  }
}
