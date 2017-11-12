package src;
import java.util.HashSet;
import java.util.Iterator;


/**
 * Created by guneetsachdeva on 9/10/17.
 * HashSet does not allow duplicates
 */
public class ExampleHashSet {


    public static void printMySet(HashSet<String> mySet) {
           for (String s: mySet){
               System.out.println(s);
           }
    }

    public static void removeName (HashSet<String> myHashSet,String name){

    }


    public static void main (String[] args) {
        HashSet<String> set = new HashSet();
        set.add("John");
        set.add("Andrew");
        set.add("John");
        set.add("Jason");
        set.add("Andrew");

        printMySet(set);

        Iterator<String> itr =set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
