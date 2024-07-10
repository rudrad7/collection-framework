package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementInArray {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,5,6,3,6,7,4,8,9,6,8,9));

        // 1. Using LinkedHashSet

        LinkedHashSet<Integer> unquieList = new LinkedHashSet<>(arrayList);
        System.out.println(unquieList);

        // 2. Using Stream API

        List<Integer> collect = arrayList.stream().distinct().collect(Collectors.toList());
        System.out.println("Using Stream API : "+ collect);
    }
}
