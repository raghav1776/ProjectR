package JAVA_Learner;

import java.util.Scanner;

public class printAllEvenNumebr {

    public static void main(String[] args){

        int limit = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Even Number: ");
        limit = scanner.nextInt();

        if( limit % 2 == 0 ){
            for( int i = 0 ; i <= limit ; i += 2);
        }
        else{
            System.out.println("Please enter even number only ");
        }
    }
}
