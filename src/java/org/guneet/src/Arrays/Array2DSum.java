package src.Arrays;

/**
 * Created by guneetsachdeva on 2/5/17.
 */


public class Array2DSum {


    public static int sum (int [][] arr){
        int total =0;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                total = total + arr[i][j];
            }

        }
        return total;
    }
    /**
     * outer for loop iterates through rows.
     * Inner for loop iterates through columns in each row
     * Add all numbers in the 2D array
     * @param args
     */
    public static void main (String[] args){
       int[][] x= {
               {2,4,3,2,6,7,1,3},
               {4,2,7,6,1,3,4,0},
               {3,5,2,6,3,7,3,4}

       } ;
       System.out.println("sum = " +sum(x));
    }
}
