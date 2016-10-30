package org.guneet.Sort;


/**
 * Created by guneet on 4/24/2016.
 */
public class Palindrome {

    public static void main(String[]args){
        String s= "Santa";
        boolean  b= checkPalindrome(s);
        System.out.println(b);
        String str= " malayalam ";
          b = checkPalindrome(str,0);
        System.out.println(" Recursion check " +b);

    }

    public static boolean checkPalindrome(String s){
        for (int i =0; i < s.length(); i++){
            if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                System.out.println(s.charAt(i) + " !=" + s.charAt(s.length()-1-1));
                return false;
            }
        }
        return true;

    }
    //uses recursion
    public static boolean checkPalindrome(String s, int i){
        if ( i > s.length()/2) return true;
        if(s.charAt(i)!= s.charAt(s.length() -i-1)) return false;
        return checkPalindrome (s,++i);
    }
}
