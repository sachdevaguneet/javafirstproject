/**
 * Created by gunee on 2/13/2016.
 */
public class FactorialRecursion {

    public static int factorial(int n) {
        if ( n==0) return 1;
        return n * factorial(n-1);
    }


    public static void main(String[]args) {
        System.out.println(factorial (10));
    }
}
