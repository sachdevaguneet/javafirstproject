package src.Maps;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guneetsachdeva on 10/7/17.
 */
public class ReverseList {
    public static void main(String[] args) {

        ArrayList<Integer> original = new ArrayList<Integer>();

        original.add(1);
        original.add(2);
        original.add(3);
        original.add(4);
        List<Integer> newNames = reverse(original);

        System.out.println(newNames);



    }
    public static List<Integer> reverse(List<Integer> original){
        List<Integer> result =  new ArrayList<Integer>();
        for(int i = 0; i<original.size() -1; i--){


        }
        return result;

    }
}
