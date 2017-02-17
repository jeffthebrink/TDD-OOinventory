import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<InventoryItem> itemArrayList = new ArrayList<>();

    public static void printList() {
        //print out current inventory list
        System.out.println();
        System.out.println("Item #   Quantity           Item                   Category");
        System.out.println("-----------------------------------------------------------");
        int i = 1;
        for (InventoryItem item : itemArrayList) {

            System.out.printf("%s\t\t\t%s\t\t\t%s\t\t\t%s\n", i, item.itemQty, item.item, item.category);
            i++;
        }

    }

    public static void main(String[] args) throws Exception {


        String password;

        System.out.printf("Hello and welcome to the armory!\n");
        System.out.printf("Please enter your password.\n");
        password = scanner.nextLine();

        checkPassword(password);

            System.out.println();
            System.out.printf("We currently have the following: \n");

            //Initialize inventory list

            initializeInventoryList();


            printList();


            //print out options
            while (true) {
                System.out.println();
                System.out.println("Please select an option. ");
                System.out.println("1. Add a new item: ");
                System.out.println("2. Remove an item: ");
                System.out.println("3. Update the quantity of an item: ");

                int option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1:
//                        createItem();
                        printList();
                        continue;
                    case 2:
                        System.out.println("Type number of item you'd like to remove. ");
                        printList();
                        removeItem();
                        printList();
                        continue;

                    case 3:
                        System.out.println("Enter the number of the item you want to update the quantity of. ");
                        printList();
                        updateItem();
                        printList();
                        continue;
                    default:
                        System.out.println("Invalid choice.");
                        continue;
                }
            }


    }

    public static boolean checkPassword(String password) {

        while (true) {
            if (password == "Jeff") {
                return true;

            } else return false;
        }
    }

    public static void initializeInventoryList() {
        itemArrayList.add(new InventoryItem(1, "broad sword", "Sword"));
        itemArrayList.add(new InventoryItem(1, "battle axe", "Axe"));
        itemArrayList.add(new InventoryItem(3, "long bow", "Bow"));
    }

    public static void updateItem() {

        int newQty = 8;
        itemArrayList.get(0).itemQty = newQty;
    }

    public static void removeItem() {

        itemArrayList.remove(0);

    }

    public static void createItem() throws Exception {

        InventoryItem newItem = new InventoryItem(5, "Huge Axe", "Axe");
        itemArrayList.add(newItem);

    }

}

