package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guneetsachdeva on 9/2/17.
 */
public class MergingLists {

    public static boolean exists(List<Integer> listFinal, Integer num) {
        for (int j = 0; j < listFinal.size(); j++) {
            if (listFinal.get(j) == num)
                return true;
        }
        return false;
    }

    public static void main (String[] args){

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20000; i++) {
            int number = (int)( Math.random() * 1000);
            list.add(number);

        }

        List<Integer> secondList = new ArrayList<>();

        for (int x = 0; x < 20000; x++){
            int othernumber  = (int)(Math.random() * 1000);
            list.add(othernumber);
        }

        List<Integer> listFinal = new ArrayList<>();
        for(int i =0;i<list.size();i++) {
            int num = list.get(i);
            if(!exists(listFinal,num)){
                listFinal.add(num);
            }
        }
        for(int i =0;i<secondList.size();i++) {
            int num = secondList.get(i);
            if(!exists(listFinal,num)){
                listFinal.add(num);
            }
        }

        //listFinal.addAll(list);
        //listFinal.addAll(secondList);


        System.out.println("Merged List :" + listFinal);
        System.out.println("Merged List Size :" + listFinal.size());








    }

}
