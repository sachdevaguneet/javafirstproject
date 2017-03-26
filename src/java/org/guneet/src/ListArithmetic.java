package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guneetsachdeva on 3/12/17.
 */
public class ListArithmetic {
    public static void main (String[]args){
        // Why ArrayList on RHS and List on LHS?
        // ArrayList is a class and List is an Interface
        // We are implicitly casting ArrayList to List because
        //ArrayList is an implementation of LIst Interface
        // Strongly typed list, for protection
        List<Integer> list = new ArrayList<>(); // this is how you declare a new list



        // example of List with heterogenous/mixed types
        //each element can have a different type
        List a = new ArrayList();

        List<Long> anotherList = new ArrayList<>();

        // java docs https://docs.oracle.com/javase/7/docs/api/
        for(int i = 0; i < 100; i++){
            // Math.random() returns a double between 0 and 1
            //Say 0.62045647, we multiply it by 100 to get
            //62.045647 and then we round it to the nearest integer
            Long x =Math.round(Math.random()*100);
            anotherList.add(x);

        }

        Long sum = 0L;
        for(int i = 0; i<100; i++){
            sum=sum+anotherList.get(i);
        }
        System.out.println("sum = " + sum);


    }
}
