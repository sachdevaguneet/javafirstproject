package org.guneet.memory;

/**
 * Created by gunee on 8/28/2016.
 */
public class Memory {
    public static void main (String[] args){
         int sum=computeSum();
            System.out.println("sum = " + sum );
    }


    public static  int computeSum () {
        int sum=0;
        for (int i = 0; i<=1000; i++){
            sum=sum+i;
        }
        return sum;
    }
}
