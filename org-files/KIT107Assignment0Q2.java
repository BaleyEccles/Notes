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

        // Sort the number by their size
        // If we dont do this the for loop wont work if we input the biggest number first
        // We dont need to check the equal case, as there would be no numbers in between them
        // And that is handled by the else
        int lowerInt = 0;
        int upperInt = 0;
        if (int1 < int2) {
            lowerInt = int1;
            upperInt = int2;
        } else {
            lowerInt = int2;
            upperInt = int1;
        }
    
        // print the numbers in between the two numbers
        // We must do 'int1 + 1' or else we will also print int1
        // int1 is not in between these two numbers, so it should not be printed
        for (int i = lowerInt + 1; i < upperInt; i++) {
            System.out.print(i); // print the current number
            System.out.print('\n'); // print a new line
        }
    }
}
