package src.NumberBases;

/**
 * Created by guneetsachdeva on 7/2/17.
 */
public class FractionBases {
    public static void testDigit(){
        String s = "0.125";
        String digit = s.substring(2,3);

        //System.out.println(digit);
    }
    public static void main (String[] args){
        // represent binary whole numbers
        int binaryNum = 0b1101;
        //could not find a way to represent binary fractions
        //int binFraction = 0b0.1101; - this did not work.
        String binStr = "0.110111010101010";
        int len = binStr.length();
        //System.out.println(binStr.charAt(len-1)); // 0-5 (Searching for offset)
        //System.out.println(binStr.charAt(len-2));
        int offset = 0;
        char nextChar = binStr.charAt(0);
        testDigit();
        while (nextChar != '.'){
            offset++;
            nextChar = binStr.charAt(offset);
        }
        offset++;
        // possible to add two variables in a for loop
        //Note that for loops have three parts:
        //1.initialization: This can initialize multiple variables but they all must be the same type.
        // They are separated by commas. The type is not explicitly declared for the second variable onwards.
        // You can have multiple variables initialized here,not limited to
        //2.condition: You can have multiple conditions separated by comma.
        //3.incrementation/Decrement: You can have multiple increments separated by commas.
        double sum =0;
        for( int j = 1,i = offset; i < binStr.length(); i++, j++){
            double fraction = 1/ Math.pow (2,j);
            String digit = binStr.substring(i, i+1);
            double term =  new Double(digit) * fraction;
            sum = sum + term;

        }
        System.out.println("Sum = " + sum);
    }
}
