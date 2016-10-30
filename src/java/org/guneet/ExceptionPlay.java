/**
 * Created by gunee on 4/17/2016.
 */
public class ExceptionPlay {


    static int i;
    public static void main(String[] args){

        int [] arr= new int[10];
        arr[10] = 4;

        String age = "";
        try {
            Integer y = new Integer(age);
            System.out.println("age = " + i);
            int x= y/i;

        }catch(NumberFormatException e) {
            System.err.println(" Entered invalid age " + age);
        }catch(Exception e) {
            System.err.println("Some other problem occured");
        }finally{
            System.out.println("It always comes here");
        }
        try {
            int y = 10;
            System.out.println(y / i);
        } catch (ArithmeticException e){
            System.err.println("Cannot divide by 0 " + e.getMessage());
        }
        System.out.println("Hello World ");



    }
}
