package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guneetsachdeva on 6/25/17.
 */
public class GenericMax {
    public static Integer getMax(List<Integer> list){
        Integer min = Integer.MIN_VALUE;
        //Homework, copy alogrithim from another file here to make it work
        return 0;
    }
    public static void main (String [] args){
        //Homework, find alternative syntax for literals (defining) as list array
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<20;i++){
            list.add((int)(Math.random()*100));

        }
        System.out.println(getMax(list));
    }
}
