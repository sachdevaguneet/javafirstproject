package src.Casting;

/**
 * Created by guneetsachdeva on 6/4/17.
 */
public class CastingObjects {


    public static void main(String[] args) {
        // all apes are not humans but all humans are apes

        Ape ape = new Ape();
        //Human human = ape; //ape being implicitly casted to Human
        Human human = new Human();
        Ape ape1 = human;
        //Human human1 = ape1; //No memory of the lineage of this ape

        Human human1 = (Human) ape1; //explicit casting is allowed
        Human human2 = null;
        try{
            human2 =  (Human) ape; // explicit cast is allowed but does not make sense

        } catch (Exception e) {
            // masking this error out
        }

        //This ape was never really a human but we forcefully converted it
        //to an ape and then tried to invoke the talk mehtod on it Hence we get
        /*Exception in thread "main" java.lang.ClassCastException: src.Casting.Ape cannot be cast to src.Casting.Human
	at src.Casting.CastingObjects.main(CastingObjects.java:19)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)*/
        // this is an example of no compiler error but a runtime error instead. And
        // there is no easy way to know if this line below will fail unless we run the program
        //Except it fails because human2 really was an ape and hence cannot talk ()
        try {
            System.out.println(human2.talk());
        } catch (ClassCastException e){
            e.printStackTrace();

        }

        System.out.println("human1 talks" + human1.talk());
    }
}

class Ape {
    int steps = 0;

    public int walk() {
        return steps++;
    }
}

//According to below, a Human extends Ape so all Humans are Apes
class Human extends Ape {
    int words = 0;

    public int talk() {
        return words++;


    }
}