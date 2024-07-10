package LinkedListConcept;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

    public static void main(String[] args) {
        LinkedList list= new LinkedList<>();
        list.add("Rudra");
        list.add(1,"Davare");
        list.add(57);
        list.set(0,"Maharudra");
        list.addFirst('c');
        System.out.println(list.toString());

        List<LinkedList<Object>> listInList = new LinkedList<>();
        listInList.add(new LinkedList<>());
        listInList.add(new LinkedList<>());
        listInList.get(0).add("Rudra");
        listInList.get(0).add(121);
        listInList.get(0).add(true);
        listInList.get(1).add("Davare");
        listInList.get(1).add(32132);
        listInList.get(1).add('a');

        System.out.println(listInList.toString());
    }

}
