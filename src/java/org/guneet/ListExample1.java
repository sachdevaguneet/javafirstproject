import java.util.ArrayList;
import java.util.List;

/**
 * Created by gunee on 2/27/2016.
 */
public class ListExample1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int number = (int)( Math.random() * 100);
            list.add(number);

        }
System.out.println(list);

        int max = 0;
        for(int i =0; i<20; i++){
            if (list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.println("max element : " + max);
    }
}
