package JAVA_ProjectSK;

import java.util.Scanner;


public class factorialCalculator {

    public static int factorialIterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Calculate factorial using iterative approach
        int factorial = factorialIterative(n);
        System.out.println("Factorial of " + n + " is: " + factorial);

        scanner.close();
    }
}

