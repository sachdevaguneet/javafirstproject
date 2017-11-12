package src.Digits;

/**
 * Created by guneetsachdeva on 7/9/17.
 */
public class ExtractDigits {
    public static void main (String [] args){
        int x = 8138756;
        int counter = 0;
        while (x >= 10){
            if (counter != 0)
            x = x/10;
            int y = x%10;
            System.out.println("Digit = " + y);
            counter++;

        }
    }
}
