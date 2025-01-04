import java.util.Scanner;

public class factorial {

    // Method to calculate factorial recursively
    public static long factorial1(int n) {
        if (n == 0) {
            return 1; // Base case: 0! = 1
        } else {
            return n * factorial1(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial1(number);
            System.out.println("Factorial of " + number + " is: " + result);
        }
        
        scanner.close();
    }
}
