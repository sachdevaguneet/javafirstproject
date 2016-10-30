import java.util.ArrayList;
import java.util.List;

/**
 * Created by gunee on 2/27/2016.
 */
public class ListExample {
    public static void main(String[] args){
        List<Integer> list= new ArrayList<>();
        list.add(4);
        System.out.println(list);
        list.add(8);
        System.out.println(list);
        list.add(0);
        System.out.println(list);
        list.add(2);
        System.out.println("initial list : " + list);
        list.remove(1);    //index of element
        System.out.println("after removing element at index 1 : " +list);
        System.out.println("fetching the new 1st element : " +list.get(1));

        list.add(5);
        list.add(7);
        System.out.println("new list" + list);

        //now lets remove the last 3 elements (Algorithim !!!)

        //list.remove(2);
        //list.remove(2);
        //System.out.println(list);
        for(int i = list.size()-1; i>1;i--){
            list.remove(i);
            System.out.println(list);
        }
    }
}
