package JAVA_Learner;

public class StringInReverseOrder {
    public static void main (String[] args){

        String S = "Raghav Raghau Selennium";

        for( int i = S.length()-1 ; i <S.length(); i-- )
        {

            System.out.println(S.charAt(i));
        }

    }
}
