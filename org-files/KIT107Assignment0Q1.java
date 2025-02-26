public class Main {
  public static void main(String[] args) {
    // Define the varibles
    char A = 'A';
    char DOLLAR = '$';

    // Print before swapping
    System.out.println("A Varible: " + A);
    System.out.println("$ Varible: " + DOLLAR);

    // Swap the varible 
    char tmp = A; // Use a temp varible to swap
    A = DOLLAR; // Assign A to be the dollar
    DOLLAR = tmp; // Assign DOLLAR to be the A, from the tmp varible

    // Print after swapping
    System.out.println("A Varible: " + A);
    System.out.println("$ Varible: " + DOLLAR);
  }
}
