import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {
//        create a new string array
        String[] items = {"apples","bananas","milk","eggs"};

//        create a List of Type string
        List<String> list=List.of(items);
//        print the result
        System.out.println(list);
        System.out.println(list.getClass().getName());
//        list.add("yogurt"); cannot add to a List because a List is immutable

//        Create an ArrayList of Type String and passing the List
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

//        Create an ArrayList and pass the list of String
        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles","mustard","cheese")
        );

//        adding to the list
        groceries.addAll(nextList);
        System.out.println(nextList);
        System.out.println(groceries);

//        getting the third element from an Arraylist
        System.out.println("Third item = " + groceries.get(2));

//        check to see if a particular String is in the arrayList
       if (groceries.contains("mustard")){
           System.out.println("List contains mustard");
       }

//       ArrayLists can contain duplicate copies
       groceries.add("yogurt");
        System.out.println(groceries);
        System.out.println("first = " + groceries.indexOf("yogurt"));
        System.out.println("last = " + groceries.lastIndexOf("yogurt"));

//        to remove a single element from an ArrayList
        groceries.remove(2);
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);

//        to remove more than 1 item at a time
        groceries.removeAll(List.of("apples","eggs"));
        System.out.println(groceries);

//        to remove the selected items from the list except those strings that are retained
        groceries.retainAll(List.of("apples","milk","mustard","cheese"));
        System.out.println(groceries);

//        to remove all items from the list
        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());

//        add items to the Grocery List using List.of
        groceries.addAll(List.of("apples","milk","mustard","cheese"));
        //        add items to the Grocery List using Arrays.asList
        groceries.addAll(Arrays.asList("eggs","pickles","mustard","ham"));
        System.out.println(groceries);
//        sorting the groceries list in alphabetical order
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        //        sorting the groceries list in reverse alphabetical order
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));



    }
}
