import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
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
        
        scanner.close();
    }
}
