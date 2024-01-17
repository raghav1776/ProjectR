package JAVA_Learner;

public class StringMeth {

    public static void main(String[] args){

        //String is an object

     //   String S1 = "Raghav Raghu Selenium";
        String S2 = "Raghav";
        String S3 = "Hello";

        String S4 = new String("Welcome");
        String S5 = new String(("back"));

        String s = "Raghav Raghu Selenium";
        String[] splitedString = s.split("Raghu");
        System.out.println(splitedString[0]);
   //     System.out.println(splitedString[1]);
        System.out.println(splitedString[1]);
        System.out.println(splitedString[1].trim());  //.trim use to remove all extra spaces
        for( int i=0; i<s.length(); i++ ){
            System.out.println(s.charAt(i));          // s.charAt(i) use to call the String because above string is not a proper Array
        }
    }
}
