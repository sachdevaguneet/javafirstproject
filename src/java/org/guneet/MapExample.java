import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by gunee on 3/5/2016.
 */
public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "bob");
        map.put(2, "john");
        map.put(4, "paul");
        map.put(4, "guneet");  //key is unique
        System.out.println(map);

        System.out.println(map.get(2));

        //map.remove (1);

        Set<Integer> set = map.keySet();
        for (Integer studentId : set) {
            String name = map.get(studentId);
            if (name.equals("john")) {
                System.out.println("Found studentId = " + studentId);
            }
        }
//how do you know you did not find a match?
        boolean found = false;
        System.out.println(map);
        Set<Integer> set1 = map.keySet();
        for (Integer studentId : set) {
            String name = map.get(studentId);
            if (name.equals("elizabeth")) {
                System.out.println("Found studentId = " + studentId);
                found = true;
            }
        }
        if (!found)
            System.out.println("Did not find elizabeth in the database");


    }
}
