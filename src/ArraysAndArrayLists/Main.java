package ArraysAndArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] originalArray = new String[]{"First","Second","Third"};
        var originalList = Arrays.asList(originalArray);
        System.out.println(originalList);

        originalList.set(0,"one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

//        sort the originalList
        originalList.sort(Comparator.naturalOrder());
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

//        originalList.remove(0); Cannot remove the element because it is an array
//        originalList.add("fourth"); Cannot add an element because it is an array

//        create a fixed type List of type String
        List<String> newList = Arrays.asList("Sunday","Monday","Tuesday");
        System.out.println(newList);

    }
}
