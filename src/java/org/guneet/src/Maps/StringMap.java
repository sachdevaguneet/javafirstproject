package src.Maps;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guneetsachdeva on 8/13/17.
 */
 class StringMap {

     List<String> keys =  new ArrayList<String>();
     List<String> values = new ArrayList<String>();

     public boolean exists(String key){
         for(int i=0; i<keys.size(); i++){
             if(key.equals(keys.get(i)))
                 return true;
         }
         return false;
     }


     public void put (String key, String value){
         if(!exists(key)) {
             keys.add(key);
             values.add(value);
         }

     }
     public int size(){
         return keys.size();
     }

     public String get(String key) {
         int counter = 0;
         while(counter < keys.size()){
             if (key.equals(keys.get(counter))){
                 return values.get(counter);
             }
             counter++;
         }
         return null;
     }

     public int remove (String key){
         int counter=0;
         while(counter < keys.size()){
             if (keys.equals(keys.get(counter))){
                 keys.remove(counter);
                 values.remove(counter);
                 return counter;
             }
             counter++;
         }
          return -1;
     }

}

