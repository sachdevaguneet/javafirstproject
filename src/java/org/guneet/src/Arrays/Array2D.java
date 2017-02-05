package src.Arrays;

/**
 * Created by guneetsachdeva on 1/29/17.
 */
public class Array2D {

    public static void main (String[] args){
        int[][] symmetric={
                {2,3,2,1,6},
                {1,5,8,3,2},
                {3,5,2,8,9}
        };
        int[][] jagged= {
                {2, 3, 2},
                {1, 5, 8, 3, 2},
                {3, 5}
        };
        // No. of rows in a two dimensional array is the length of the array
        // No. of columns in a 2D array is the length of the ith element of an array
        // created a placeholder to store the data in the array
        int[][] symmcopy = new int [symmetric.length][symmetric[0].length];

        System.arraycopy(symmetric,0,symmcopy,0, symmetric.length);

        System.arraycopy(symmetric,0,symmcopy ,2,1);

        System.arraycopy(symmetric,1,symmcopy,1,1);

        System.arraycopy(symmetric,2,symmcopy,0,1);


        //first dimension has one row
        // this one row has no columns for now
        int[][] x= new int[1][];
    }
}
