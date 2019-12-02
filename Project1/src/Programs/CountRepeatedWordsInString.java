package Programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CountRepeatedWordsInString {

   public static void main(String args[]){

       String input = "I am here here i am friend";
       String[] word = input.split(" ");

       Map<String, Integer> map = new LinkedHashMap<String, Integer>();
       for(String str : word) {
           if (map.get(str) != null) {
               map.put(str, map.get(str) + 1);

           } else {
               map.put(str, 1);
           }
       }

      Set<String> sett = map.keySet();
       for( String str : sett){
           System.out.println("words are" +" " +str +" " +"repeated" +map.get(str));

       }
   }
}




