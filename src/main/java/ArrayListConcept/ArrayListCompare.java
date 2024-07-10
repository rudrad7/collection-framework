package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

    public static void main(String[] args) {
        /*
           Compare two array list
           First short the array list and then do equal
         */

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Rudra","Pradip","Ananya","Rakesh"));
        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("Rakesh","Pradip","Ananya","Rudra"));
        System.out.println(arrayList1.equals(arrayList));  // --> Here we are directly compare this two list without sorting

        Collections.sort(arrayList);
        System.out.println(arrayList);

        Collections.sort(arrayList1);
        System.out.println(arrayList1);

        System.out.println(arrayList1.equals(arrayList));   // --> Here we are sorting first and then do compare

        /* Q. Compare two list - find out the additional element: */

        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("Man","Roj","Anni","Amol","Akash"));
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("Man","Roj","Amol","Anni","Avinash"));
        l1.removeAll(l2);
        System.out.println(l1);

        /* Q. Find out the missing element */

        ArrayList<String> l3 = new ArrayList<>(Arrays.asList("Man","Roj","Anni","Amol","Akash"));
        ArrayList<String> l4 = new ArrayList<>(Arrays.asList("Man","Roj","Amol","Anni","Avinash"));

        l4.removeAll(l3);
        System.out.println(l4);



    }

}
