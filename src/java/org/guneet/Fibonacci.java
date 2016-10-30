/**
 * Created by gunee on 2/6/2016.
 */
public class Fibonacci {

    public void computeSeries(int numTerms) {
      int before = 1;
        int oneBefore = 0;
        System.out.print(oneBefore+"," + before);
        for(int i = 0; i< numTerms-2; i++){
            int temp = before;
            before = before + oneBefore;
            if(before < 0){
                System.out.println();
                System.out.println("Found " + i +" terms");
                break;
            }
            System.out.print("," + before);
            oneBefore = temp;
        }
    }
    public static void main(String[] args){
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.computeSeries(100);
    }
}
