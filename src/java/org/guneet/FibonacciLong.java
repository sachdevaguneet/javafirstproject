/**
 * Created by gunee on 2/6/2016.
 */
public class FibonacciLong {

    public void computeSeries(int numTerms) {
      long before = 1;
        long oneBefore = 0;
        System.out.print(oneBefore+"," + before);
        for(int i = 0; i< numTerms-2; i++){
            long temp = before;
            before = before + oneBefore;
            System.out.print("," + before);
            oneBefore = temp;
        }
    }
    public static void main(String[] args){
        FibonacciLong fibonacci = new FibonacciLong();
        fibonacci.computeSeries(100);
    }
}
