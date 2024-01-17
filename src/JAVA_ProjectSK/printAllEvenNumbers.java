package JAVA_ProjectSK;

import java.util.Scanner;

public class printAllEvenNumbers {
    public static void main(String[] args) {
        int limit = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a limit: ");
        limit = scanner.nextInt();

        if (limit % 2 == 0) {
            for (int i = 2; i <= limit; i += 2) {
                System.out.println(i);
            }
        } else {
            System.out.println("Please enter an even number as the limit.");
        }
        scanner.close();
    }
}




