package src.Maps;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guneetsachdeva on 10/7/17.
 */
public class ReverseList2 {
    public static void main(String[] args) {

        ArrayList<Integer> original = new ArrayList<Integer>();
        original.add(0);
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(4);
        original.add(5);
        original.add(6);
        original.add(7);
        List<Integer> reversedList = reverse(original);

        System.out.println(reversedList);



    }
    public static List<Integer> reverse(List<Integer> original){

        for(int i =0; i<=(original.size()/2); i++){
            int z = original.get(i);
            original.set(i,original.get(original.size()-i-1));
            original.set(original.size()-i-1, z);



        }
        return original;

    }
}
