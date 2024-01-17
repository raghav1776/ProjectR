package JAVA_Learner;

public class Variable {

    static int a =10;
    void fun(){
        int b = 10;
        System.out.println(a+" "+b);
        a++; b++;
    }
    public static void main (String[] args){
        Variable ref = new Variable();
        ref.fun();
        ref.fun();
    }
}
