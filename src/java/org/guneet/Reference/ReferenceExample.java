package org.guneet.Reference;

/**
 * Created by gunee on 5/14/2016.
 */
public class ReferenceExample {
    /**
     * x is passed by value
     * @param x
     */
    public static void processInt(int x){
        x=2;
    }

    /**
     * s is passed by value
     * String is an exceptional case, being an object is still passed by value
     * Strings are imutable
     * @param s
     */
    public static void processString(String s){
        s="world";
    }

    /**
     * Objects other than string are passed by reference
     * The value inside the object is changed
     * @param intContainer
     */
    public static void processIntContainer(IntContainer intContainer){
        intContainer.x=4;
    }
    public static void main(String[] args){
        int x=4;
        processInt(x);
        System.out.println(x);

        String s = "Hello";
        processString(s);
        System.out.println(s);

        IntContainer intContainer = new IntContainer();
        intContainer.x= 5;
        processIntContainer(intContainer);
        System.out.println(intContainer.x);

        processInt(intContainer.x);
        System.out.println(intContainer.x);


        IntContainer c = new IntContainer();
        c.x=7;
        IntContainer b= c;
        b.x=9;
        System.out.println(c.x);



    }
}
class IntContainer{
    public int x;
}
