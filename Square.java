import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        // Check if there is input available
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
        
            int square = number * number;
            int cube = number * number * number;
            
            System.out.println("Square of " + number + " is: " + square);
            System.out.println("Cube of " + number + " is: " + cube);
        } else {
            System.out.println("Please enter a valid number.");
        }
        
        scanner.close();
    }
}
