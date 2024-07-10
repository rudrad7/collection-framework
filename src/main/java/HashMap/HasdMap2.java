package HashMap;

import java.util.*;

public class HasdMap2 {
    public static void main(String[] args) {

        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");
        HashMap<Integer,String> map2 = new HashMap<>();
        map2.put(3,"C");
        map2.put(2,"B");
        map2.put(1,"A");
        HashMap<Integer,String> map3 = new HashMap<>();
        map3.put(1,"A");
        map3.put(2,"B");
        map3.put(3,"C");
        map3.put(3,"D");

        //Q.1-> Compare two hashMap : on basis of key-value both : use equal method
        System.out.println(map1.equals(map2));
        System.out.println(map1.equals(map3));

        //Q.2-> Compare hashMap for the same key only : use keySet() method
        System.out.println(map1.keySet().equals(map2.keySet()));
        System.out.println(map1.keySet().equals(map3.keySet()));  //-->Getting true because hashMap doesn't store duplicate key

        //Q.3-> Find the missing/extra key in hashMap:
        HashMap<Integer,String> map4 = new HashMap<>();
        map4.put(1,"A");
        map4.put(2,"B");
        map4.put(3,"C");
        map4.put(4,"D");

        Set<Integer> keySet = new HashSet<>(map1.keySet());
        keySet.addAll(map4.keySet());
        keySet.removeAll(map1.keySet());
        System.out.println(keySet);

        HashMap<Integer,String> map5 = new HashMap<>();
        map5.put(1,"A");
        map5.put(2,"B");
        map5.put(3,"C");
        map5.put(4,"D");
        HashMap<Integer,String> map6 = new HashMap<>();
        map6.put(1,"A");
        map6.put(2,"B");
        map6.put(3,"C");
        map6.put(4,"D");
        map6.put(5,"D");
        // compare map by values : duplicate are  not allowed
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map4.values()))); //true
        System.out.println(new ArrayList<>(map6.values()).equals(new ArrayList<>(map5.values()))); //false
        // compare map by values : duplicate are allowed
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map5.values()))); //true
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map4.values()))); //true

            ArrayList<Object> a = new ArrayList(Arrays.asList("19","rdra",true,null,100,'c'));
            System.out.println(a);
            a.remove(1);
            System.out.println(a);
            a.add(1,"rudra");
        System.out.println(a);
    }
}
