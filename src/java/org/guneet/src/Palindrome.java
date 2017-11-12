package src;

/**
 * Created by guneetsachdeva on 5/7/17.
 */
public class Palindrome {
    public static void main (String [] args){
        String s = "malayalam";
        boolean palindrome = true;
        for (int i =0;i<s.length(); i++){
            System.out.println("f = " + s.charAt(i));
            System.out.println("l = " + s.charAt(s.length()-i-1));
            if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                palindrome = false;
                break;


            }
            if (i>=(s.length()-i-1)){
                break;
            }

        }
        System.out.println("Malayalam = " + palindrome);

    }
}
