import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Create the scanner, used to read in the floats
    Scanner scanner = new Scanner(System.in);
    
    // Create a constant to signify how many numbers we will create IN TOTAL
    final int MAX_NUMBER_OF_FLOATS = 10;
    
    System.out.print("Enter 10 floating point numbers, pressing enter after each number");
    System.out.print("Enter -1.0 if you would like to stop");
    int number_of_floats = 0;
    float[] floats = new float[MAX_NUMBER_OF_FLOATS];
    for (int i = 0; i < MAX_NUMBER_OF_FLOATS; i++) {
      float current_float = scanner.nextFloat();
      if (current_float == -1.0) { // Check if the intput is -1.0
        // If so, set i = 10, which will break from the for loop
        i = MAX_NUMBER_OF_FLOATS;
      } else {
        // Else, set the float 
        floats[i] = current_float;
        
        // Increment so we know how many floats the user has input
        number_of_floats++;
        
      }
    }

    // Sum the numbers
    float sum = 0.0f;
    for (int i = 0; i < number_of_floats; i++) {
      sum += floats[i];
    }

    // Print the sum
    System.out.print("Sum of your numbers: " + sum);

  }
}
