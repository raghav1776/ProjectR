package JAVA_Learner;

import java.util.Scanner;


public class enhancedArray {

    public static void main(String[] args) {

        String[] name = {"raghav","raghu","raghvendra", "selenium"};
//
//        for ( int i=0 ; i < name.length ; i++)
//        {
//            System.out.println(name[i]);
//        }

        for ( String s : name){
            System.out.println(s);
        }
    }

}

