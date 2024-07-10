package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapBasis {
    public static void main(String[] args) {

        HashMap<String,String> map1 = new HashMap<String,String>();
        map1.put("India","New Delhi");
        map1.put("USA","Washington DC");
        map1.put("UK","London");
        map1.put(null,"Berlin");
        System.out.println(map1.get(null));   // ---> OUTPUT : Berlin
        System.out.println(map1.get("UK"));  // ---> OUTPUT : London

        Iterator<String> iterator = map1.keySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            String value = map1.get(key);
            System.out.println("Key = "+key+" "+"Value = "+value);
        }
        System.out.println("-----------------------------------------");
        Set<Map.Entry<String, String>> entries = map1.entrySet();
        Iterator<Map.Entry<String, String>> iterator1 = map1.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, String> next = iterator1.next();
            System.out.println("Key = "+next.getKey()+" "+"Value = "+next.getValue());
        }
        System.out.println("---------------------------------------");
        // iterating map using java 9 lambda
        map1.forEach((r,d)-> System.out.println("Key = "+r+" " + "Value = "+d));
    }
}
