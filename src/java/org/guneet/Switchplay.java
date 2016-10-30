import java.util.Scanner;

/**
 * Created by gunee on 2/20/2016.
 */
public class Switchplay {

    public static void dayMaster(){
        int question= 0;
        String answer ="";

        while(question != -1){
            System.out.println("Enter a number : ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNext()){
                try {
                    question = new Integer(sc.next());
                } catch (Exception e){
                    answer = "INVALID QUESTION";
                    System.out.println(answer);
                    continue;
                }
                switch (question){
                    case 0 :
                        answer = "Mon";
                        break;
                    case 1 :
                        answer = "Tues";
                        break;
                    case 2:
                        answer = "Wed";
                        break;
                    case 3 :
                        answer = "Thurs";
                        break;
                    case 4 :
                        answer = "Fri";
                        break;
                    case 5:
                        answer = "Sat";
                        break;
                    case 6:
                        answer = "Sun";
                        break;
                    case -1:
                        answer = "BYE";
                        break;
                    default:
                        answer = "INVALID QUESTION";


                }

            }
            System.out.println(answer);
        }
    }
    public static void main (String[] args){
        dayMaster();


    }
}
