package JAVA_Learner;

import java.util.Scanner;


public class learnerrr {
    public static void main(String[] args){

        int limit = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter limit: ");
        limit = scanner.nextInt();

        if (limit % 2 == 0) {
            for (int i = 2; i <= limit; i += 2) {
                System.out.println(i);
            }
        }
            else {
                System.out.println("PLEASE ENTER ONLY EVEN NUMBER");
            }
        }

    }
