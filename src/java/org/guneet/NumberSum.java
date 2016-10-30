/**
 * Created by gunee on 1/16/2016.
 */
public class NumberSum {
    public static void main(String[] args){
        // add up numbers from 1 to 100
        int sum = 0;
        for (int i=0; i < 1000; i++) {
            sum = sum + i;
        }
        System.out.println("sum = " + sum);
    }
}
