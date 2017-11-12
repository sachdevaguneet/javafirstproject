package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guneetsachdeva on 9/2/17.
 */
public class UnionLists {
    public static void main (String[] args){

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int number = (int)( Math.random() * 100);
            list.add(number);

        }

        List<Integer> secondList = new ArrayList<>();

        for (int x = 0; x < 20; x++){
            int othernumber  = (int)(Math.random() *100);
            list.add(othernumber);
        }

        List<Integer> listFinal = new ArrayList<>();
        listFinal.addAll(list);
        listFinal.addAll(secondList);

        System.out.println("Union List :" + listFinal);
        System.out.println("Union List Size :" + listFinal.size());








    }

}
