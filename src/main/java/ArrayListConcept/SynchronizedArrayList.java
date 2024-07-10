package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
    public static void main(String[] args) {
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());
        synchronizedList.add("Rudra");
        synchronizedList.add("Davare");
        synchronizedList.add("MSC");

            /**  add, remove we don't need explicit synchronization
                to fetch / travers record we need explicit synchronization **/

            synchronized (synchronizedList){
                Iterator<String> iterator = synchronizedList.iterator();
                while (iterator.hasNext()){
                    System.out.println(iterator.next());
                }
            }

        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("MSC");
        copyOnWriteArrayList.add("Davare");
        copyOnWriteArrayList.add("Rudra");

        while(copyOnWriteArrayList.iterator().hasNext()){
            System.out.println(copyOnWriteArrayList.iterator().next());
        }

        /* CopyOnWriteArrayList – it’s a class in java :
         We don’t need any synchronization for any operation like : add, remove and traverse the element.
         CopyOnWriteArrayList is a thread safe ArrayList class. */

         }
}
