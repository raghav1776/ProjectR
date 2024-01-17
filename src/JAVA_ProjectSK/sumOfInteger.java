package JAVA_ProjectSK;

import java.util.Scanner;

public class sumOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers you want to sum: ");
        int n = scanner.nextInt();

        int sum = 0;

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += num;
        }

        System.out.println("Sum of the entered integers: " + sum);

        scanner.close();
    }
}



