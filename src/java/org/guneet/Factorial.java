/**
 * Created by gunee on 2/13/2016.
 * This is a test of git.
 * This is another test.
 */
public class Factorial {
    public static void main (String[]args){
        System.out.println(factorial(25));

        }
    public static int factorial(int n) {
        int f = 1;
        for (int i = n; i >= 1; i--) {
            f=f * i;
            System.out.println("f =" + f);
        }
        return f;
    }
}
