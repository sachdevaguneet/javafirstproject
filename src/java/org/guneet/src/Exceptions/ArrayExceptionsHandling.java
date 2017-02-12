package src.Exceptions;

/**
 * Created by guneetsachdeva on 2/12/17.
 */
public class ArrayExceptionsHandling {
    public static void main (String []args){
        int[] someArr= new int [10];

        try {


            someArr[1] = 4;
            someArr[3] = 7;
            someArr[5] = 2;
            someArr[10] = 5;//program died here
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Something went wrong: " + e.getMessage());

        }

        for(int i=0;i<10;i++){ // never reaches this line
            System.out.println(someArr[i]);
        }
    }
}
