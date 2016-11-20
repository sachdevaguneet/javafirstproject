/**
 * Getting a test change.
 * Created by gunee on 1/31/2016.
 */
public class ArrayPlay {
    public static void main (String[] args) {
        //static initialization
        String[] weekdays = {"Mon","Tues","Wed","Thu", "Fri"};
        for(int i=0; i< weekdays.length;i++){
            System.out.println(weekdays[i]);

        }
        System.out.println(weekdays[0]);
        System.out.println(weekdays[1]);//etc

        String[][] theatre = new String[5][4];
        for (int i =0; i < theatre.length;i++) {
            for (int j =0; j < theatre[i].length; j++){
                theatre[i][j] = "seat" + i + j;
            }
        }
        for (int i =0; i < theatre.length;i++) {
            for (int j =0; j < theatre[i].length; j++){
                System.out.print(theatre[i][j] + " ");

            }
            System.out.println();
        }

        //dynamic 2 dimensional array, "jagged" array
        //variable number of people per row
        String[][] people= new String[5][];
        people[0] = new String[3];
        people[1] = new String[3];
        people[2] = new String[2];
        people[3] = new String[1];
        people[4] = new String [4];

        //3 dimensional array
        String[][][] eastridge = new String [3][40][35]; //fixed sizes

        String[][][] eastridge1 = new String [3][][]; //dynamic size
        eastridge1[0] = new String[40][30];//first theatre
        eastridge1[1] = new String[20][15];//second theatre
        eastridge1[2] = new String[20][15];//third theatre




    }
}
