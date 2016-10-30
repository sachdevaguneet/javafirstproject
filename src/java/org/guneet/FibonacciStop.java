/**
 * Created by gunee on 2/6/2016.
 */
public class FibonacciStop {

    public void computeSeries() {
      int before = 1;
        int oneBefore = 0;
        System.out.print(oneBefore+",");
        int i = 2;
        while(before > 0){
            int temp = before;
            System.out.print("," + before);
            before = before + oneBefore;
            oneBefore = temp;
            i++;
        }
        System.out.println("Found" + i + "terms");
    }
    public static void main(String[] args){
        FibonacciStop fibonacci = new FibonacciStop();
        fibonacci.computeSeries();
    }
}
