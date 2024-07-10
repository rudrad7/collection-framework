package ArrayListConcept;

import java.util.*;

public class SynchronizedArrayListProgram {

    public static void main(String[] args) {

        ArrayList<?> ls = new ArrayList();            // non synchronized ArrayList Object
        List<?> ls1 = Collections.synchronizedList(ls); //synchronized arraylist Object

        HashSet<?> set = new HashSet<>();              // non synchronized HashSet Object
        Set<?> set1 = Collections.synchronizedSet(set); // synchronized HashSet Object

        HashMap<String,Object> hashMap = new HashMap<>();  // non synchronized HashMap Object
        Map<String, Object> hashmap1 = Collections.synchronizedMap(hashMap); //synchronized HashMap Object
    }
}
