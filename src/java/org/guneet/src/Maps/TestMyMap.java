package src.Maps;

/**
 * Created by guneetsachdeva on 8/20/17.
 */
public class TestMyMap {
    public static void main(String[] args){
        MyMap myMap = new MyMap();

        myMap.put(1, "Sun");
        myMap.put(2,"Mon");
        myMap.put(3,"Tues");
        myMap.put(4,"Wed");
        myMap.put(4,"Wed");

        System.out.println(myMap.get(3));

        myMap.remove(2);
        
        System.out.println(myMap.get(2));
        System.out.println(myMap.size());

    }

}
