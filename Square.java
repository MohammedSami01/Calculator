import java.util.InputMismatchException;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Input number from the user
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            // Calculate square
            int square = number * number;
            
            // Calculate cube
            int cube = number * number * number;
            
            // Display results
            System.out.println("Square of " + number + " is: " + square);
            System.out.println("Cube of " + number + " is: " + cube);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            scanner.close(); // Close the Scanner object to release system resources
        }
    }
}
