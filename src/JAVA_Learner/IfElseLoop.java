package JAVA_Learner;

public class IfElseLoop {

    public static void main( String [] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 22, 23, 1234, 22, 55};

        // Multiple of 2 will print
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0){
                System.out.println(arr[i]);
            }
            else{
                System.out.println(arr[i]+" is not a multile of 2");
            }
        }
    }
}
