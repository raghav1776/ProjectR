package JAVA_ProjectSK;

import java.util.Scanner;


public class SumOfDigit {

    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Calculate the sum of digits using the calculateSumOfDigits function
        int sum = calculateSumOfDigits(n);
        System.out.println("Sum of digits of " + n + " is: " + sum);

        scanner.close();
    }
}

