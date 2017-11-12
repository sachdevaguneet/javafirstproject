package src.Maps;


import java.util.ArrayList;
import java.util.List;


/**
 * Created by guneetsachdeva on 9/17/17.
 */
public class DetectingDuplicates {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(8);
        list1.add(1);
        list1.add(5);
        list1.add(10);
        list1.add(5);
        list1.add(6);
        list1.add(1);
        list1.add(13);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(2);
        list2.add(1);
        list2.add(1);
        list2.add(1);

    }
    public List findDuplicate(List<Integer> list ){
         List<Integer> duplist = new ArrayList<>();
         MyMapInt dupmap = new MyMapInt();
         for (int i =0; i<list.size(); i++){
             Integer element = list.get(i);
             if (!dupmap.exists(element))
                 dupmap.put(element,1);
             else {
                 int k = dupmap.get(element);
                 k = k+1;
                 dupmap.put(element,k);

             }
         }
         List<Integer> keys = dupmap.keys();
         for(int i = 0; i<keys.size();i++){
             int key = keys.get(i);
             int k = dupmap.get(key);
             if(k>1){
                 duplist.add(key);
             }
             System.out.println(duplist);
         }
         return duplist;

    }




        }






