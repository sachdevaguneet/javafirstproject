package src;

/**
 * Created by guneetsachdeva on 3/26/17.
 */
public class IntMax {
    int y = 0;     // this is an instance variable
    public static void main (String [] args){
        int x= Integer.MAX_VALUE;
        x=x+1;
        System.out.println(x);
        if ( x == Integer.MIN_VALUE) {
            System.out.println("Yes they are equal");
        } else
            System.out.println(" No they are not equal");
    }
}
