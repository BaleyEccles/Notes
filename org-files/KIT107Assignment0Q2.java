import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Create the scanner, used to read in the floats
    Scanner scanner = new Scanner(System.in);

    // Read the two numbers
    System.out.print("Enter a integer: ");
    int int1 = scanner.nextInt();
    System.out.print("Enter another integer: ");
    int int2 = scanner.nextInt();

    // print the numbers in between the two numbers
    // NOTE: We must do 'int1 + 1' or else we will also print int1
    // int1 is not in between these two numbers, so it should not be printed
    for (int i = int1 + 1; i < int2; i++) {
      System.out.print(i); // print the current number
      System.out.print('\n'); // print a new line
    }
  }
}
