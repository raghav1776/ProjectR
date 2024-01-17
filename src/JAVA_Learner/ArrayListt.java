package JAVA_Learner;

import java.util.ArrayList;

public class ArrayListt {

    public static void main(String[] ars){

        ArrayList<String> a = new ArrayList<String>();
        // ArryList is a clss
        // Create object of class - object.method (We are doing this to use method of that class)
        a.add("Raghav");
        a.add("raghu");
        a.add("Raghvendra");
        a.add("Selenium,");

        System.out.println(a.get(2));
// Normal Loop
        for ( int i=0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
// Enhanced loop
        for( String val: a) {
            System.out.println(val);
        }
// item conatin in ArrayList or not

        System.out.println(a.contains("Raghav"));
    }
}
