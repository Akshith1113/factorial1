import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }

    
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;  
        }
        return  fact ;
    }
}

