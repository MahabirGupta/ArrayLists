package ArrayListChallenge;

import java.util.*;

public class ArrayListChallenge {
   private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();
//        System.out.println("Available actions: ");
//        System.out.println("0 - to shutdown");
//        System.out.println("1 - to add item(s) to list (comma delimited list)");
//        System.out.println("2 - to remove any items (comma delimited list)");
//        System.out.print("Enter a number for which action you want to do: ");
//        int choice = scanner.nextInt();
//        scanner.nextLine();  // Consume the newline character
        while (true) {
            int  choice = printMenu();
//            String[] groceries = new String[]{}; // not required because declaring an ArrayList of type String
            switch (choice) {
                case 0:
                    System.out.println("Thank you for visiting. Shutting down");
                    break;
                case 1:
                     addItems(groceryList);
//                     printMenu();
//                    System.out.println("choice additems = " + choice);
//                    if (choice == 1 ){
//                        continue;
//                    }
//                    break;
                    continue;
                case 2:
                    deleteItems(groceryList);
//                     printMenu();
//                    System.out.println("choice deleteitems = " + choice);
//
//                    if (choice == 1 || choice ==2){
//                        continue;
//                    }
                    continue;
//                    break;
                default:
                    System.out.println("Invalid selection.");
//                    System.out.println("Available actions: ");
//                    System.out.println("0 - to shutdown");
//                    System.out.println("1 - to add item(s) to list (comma delimited list)");
//                    System.out.println("2 - to remove any items (comma delimited list)");
//                    System.out.print("Enter a number for which action you want to do: ");
//                    choice = scanner.nextInt();
                    continue;
            }break;
        }
    }

    private static int printMenu(){
        System.out.println("Available actions: ");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to add item(s) to list (comma delimited list)");
        System.out.println("2 - to remove any items (comma delimited list)");
        System.out.print("Enter a number for which action you want to do: ");
       int choice = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        return choice;
    }
    private static void addItems(ArrayList<String> groceryList){
        System.out.println("Add item(s) [seperate items by comma]: ");
        String[] items = scanner.nextLine().split(",");

        for (String item : items) {
            item = item.trim();  // Remove leading/trailing spaces
            if (!groceryList.contains(item)) {//checking item is not in the list
                groceryList.add(item);
            } else {
                System.out.println(item + " is already in the list. Skipping duplicate.");
            }
        }

        System.out.println(groceryList);
        groceryList.sort(Comparator.naturalOrder());
        System.out.println("Current grocery list: " + groceryList);

    }
    private static void deleteItems(ArrayList<String> groceryList){
//        System.out.println(groceryList);
        System.out.println("Enter item(s) to remove (comma delimited): ");
        String[] items = scanner.nextLine().split(",");
        for (String item : items) {
            item = item.trim();  // Remove leading/trailing spaces
//            groceryList.remove(item);
            if (groceryList.contains(item)) {// check if item is in the list
                groceryList.remove(item);
            } else {
                System.out.println(item + " is not in the list. Cannot remove.");
            }
        }
        groceryList.sort(Comparator.naturalOrder());
        System.out.println("Current grocery list: " + groceryList);
    }
}
