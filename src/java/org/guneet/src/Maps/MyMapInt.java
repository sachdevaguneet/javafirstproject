package src.Maps;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guneetsachdeva on 8/13/17.
 */
class MyMapInt {

     List<Integer> keys =  new ArrayList<Integer>();
     List<Integer> values = new ArrayList<Integer>();

     public boolean exists(int key){
         for(int i=0; i<keys.size(); i++){
             if(key == keys.get(i))
                 return true;
         }
         return false;
     }
    public List<Integer> keys(){
         return keys;
    }


     public void put (int key, Integer value){
         if(!exists(key)) {
             keys.add(key);
             values.add(value);
         }

     }
     public int size(){
         return keys.size();
     }

     public Integer get(int key) {
         int counter = 0;
         while(counter < keys.size()){
             if (key == keys.get(counter)){
                 return values.get(counter);
             }
             counter++;
         }
         return null;
     }

     public int remove (int key){
         int counter=0;
         while(counter < keys.size()){
             if (key==keys.get(counter)){
                 keys.remove(counter);
                 values.remove(counter);
                 return counter;
             }
             counter++;
         }
          return -1;
     }

}

