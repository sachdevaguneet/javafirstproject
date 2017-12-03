package org.guneet.Sort;

/**
 * Created by gunee on 4/9/2016.
 */
public class SelectionSort {
    // test for git

    public static int[] sort(int[] numbers){
        int count = 0;
        for (int i = 0; i< numbers.length; i++){
            if (i== numbers.length - 1) break;
            int min= numbers[i+1];
            int minIndex =i+1;
           for (int j = i+ 1; j< numbers.length; j++){
               count++;
               if (numbers [j] < min){
                   min = numbers[j];
                   minIndex = j;
               }
           }
            int t = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i]=t ;
        }
        System.out.println("Number of comparisons = " + count);
        return numbers;
    }

    public static void print( int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            System.out.println( numbers[i] + ",");
        }
    }
    public static void main(String[] args){
        int[] numbers ={6,4,2,1,3};
        //int[] numbers  = new int [6];
        //for (int i=0; i<6; i++){
            //int r = (int)(Math.random()*100);
            //numbers[i] = r;


        //}
        print(numbers);
        System.out.println();

        print (sort(numbers));
    }
}
