/**
 * Created by gunee on 2/20/2016.
 */
public class WhileExample {

    public static int addOdd() {
        int sum = 0;
        int i= 1;
        int numTerms= 0;

        while (sum < 10000 ) {
            sum= sum +i;
            numTerms++;
            i=i+2;

        }
        System.out.println("Latest odd number =" + i);
        System.out.println("Latest odd number =" + sum);

        return numTerms;
    }


    public static void main(String[] args){
        System.out.println("Number of iterations for sum <1000 =" + addOdd());

    }
}
