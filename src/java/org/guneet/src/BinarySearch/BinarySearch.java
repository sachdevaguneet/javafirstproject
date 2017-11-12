package src.BinarySearch;

/**
 * Created by guneetsachdeva on 10/27/17.
 * Binary Search works on presorted array/list of elements
 */
public class BinarySearch {
    public static void main (String [] args) {
        int[] x = new int [100];  //one way to define an array\
        //another way to define an array
        int[] y = {1,3,7,14,71,85,93,107,121,134,155,156,186,234,275};
        int ind = findNumber(y, 71);
        System.out.println(" Index of 71 is " + ind);
    }

    public static int findNumber (int [] inArr, int candidate ) {
        int startOffset = 0;
        int stopOffset = inArr.length -1;
        int middleOffset = -1;
        boolean found = false;
        while (!found) {
            System.out.println("startOffset = "+ startOffset + ",  " + "stopOffset = " +stopOffset);

            middleOffset = (startOffset + stopOffset)/2;
            int middle = inArr[middleOffset];
            if (candidate > middle ) {
                startOffset = middleOffset;
            }else if (candidate < middle ) {
                stopOffset = middleOffset;
            }else{
                found = true;
            }
            if (!found && (startOffset ==(stopOffset - 1))) {
                return -1;
            }
        }
        return middleOffset;
    }
}
