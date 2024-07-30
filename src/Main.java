import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name,String type, int count){
//    Create a constructor

   public GroceryItem(String name) {
//       intialising the variables:name, type and count
       this(name,"DAIRY",1);
    }

//    @Override
//    public String toString() {
//        return "GroceryItem{" +
//                "name='" + name + '\'' +
//                ", type='" + type + '\'' +
//                ", count=" + count +
//                '}';
//    }
    @Override
    public String toString(){
       return String.format("%d %s in %s",count,name.toUpperCase(),type);
    }
}
public class Main {

    public static void main(String[] args) {

//        Create a 1 dimensional Object array with array size of 3
//        Object[] groceryArray = new Object[3];
        GroceryItem[] groceryArray = new GroceryItem[3];
//                initialing the GroceryItem
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples","PRODUCE",6);
//        groceryArray[2] = "5 oranges";
        groceryArray[2] = new GroceryItem("oranges","PRODUCE",5);
        System.out.println(Arrays.toString(groceryArray));

//        Create an arraylist
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("butter"));
        objectList.add("Yogurt"); // adding a String literal

//        Create an arraylist of type GroceryItem
        ArrayList<GroceryItem> groceryItems = new ArrayList<>();
//        adding items into the arraylist
        groceryItems.add(new GroceryItem("butter"));
        groceryItems.add(new GroceryItem("milk"));
        groceryItems.add(new GroceryItem("Oranges","Produce",5));
//        groceryItems.add("Yogurt"); // cannot add a String literal
//        adding items to the start of the list using add
        groceryItems.add(0,new GroceryItem("apples","Produce",8));
        //        adding items to the list using set
        groceryItems.set(1,new GroceryItem("mangoes","Natural",34));
//        removing items from the list
        groceryItems.remove(3);

//        printing out an arraylist
        System.out.println(groceryItems);

    }
}
