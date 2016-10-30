/**
 * Created by gunee on 1/16/2016.
 */
public class FactorialEx {
    public static void main(String[] args){
        // add up numbers from 1 to 100
        int factorial = 1;
        for (int i=1; i < 10; i++) {
            factorial = factorial * i;
        }
        System.out.println("factorial = " + factorial);
    }
}
