import java.util.*;
public class ShoppingApp {
    public void addItem(){
        
    }
    public void showItem(){

    }
    public void deleteItem(){

    }
    public void updateItem(){

    }
    public void orderItem(){

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Amazon.com's shopping cart!");
        System.out.println("Please select from the following options:");
        System.out.println("\t1. Add an Item to your Cart.");
        System.out.println("\t2. Show Items in your Cart.");
        System.out.println("\t3. Remove an Item from your Cart.");
        System.out.println("\t4. Update Quantity of an Item in your Cart.");
        System.out.println("\t5. Order Menu.");
        System.out.println("\t6. Exit Application.\n");
        int choice = sc.nextInt();
        ShoppingApp s = new ShoppingApp();

        while(true) {
            switch (choice) {
                case 1: s.addItem();
                break;
                case 2: s.showItem();
                break;
                case 3: s.deleteItem();
                break;
                case 4: s.updateItem();
                break;
                case 5: s.orderItem();
                break;
                case 6: System.exit(1);
                break;
            }
            }
    }
}
