package src.Maps;


import java.util.ArrayList;
import java.util.List;


/**
 * Created by guneetsachdeva on 9/17/17.
 */
public class DetectingDuplicates2 {


    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add((int) (Math.random()*100));
        list1.add((int) (Math.random()*100));
        list1.add((int) (Math.random()*100));
        list1.add((int) (Math.random()*100));
        list1.add((int) (Math.random()*100));
        list1.add((int) (Math.random()*100));
        list1.add((int) (Math.random()*100));
        list1.add((int) (Math.random()*100));

        List<Integer> list2 = new ArrayList<>();
        list2.add((int) (Math.random()*100));
        list2.add((int) (Math.random() *100));
        list2.add((int) (Math.random() *100));
        list2.add((int) (Math.random() *100));
        list2.add((int) (Math.random() *100));
        list2.add((int) (Math.random() *100));

        System.out.println("List1 =" + list1);
        System.out.println("List2 = " + list2);

        List<Integer> noDupList = mergeList(list1,list2);
        System.out.println("mergedList=" + noDupList);
    }



    public static List mergeList(List list101, List list201) {
        List<Integer> mergedList = new ArrayList<>();

        for (int i = 0; i < list101.size(); i++) {
            Integer obj = (Integer)list101.get(i);
            if (list201.contains(obj)) {
                list201.remove(obj);
            }
        }
        mergedList.addAll(list101);
        mergedList.addAll(list201);
        return mergedList;
    }



       // uses map, use without maps
       public List findDuplicate(List<Integer> list ) {
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






