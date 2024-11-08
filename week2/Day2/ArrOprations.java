import java.util.*;

public class ArrOprations {
    Scanner sc = new Scanner(System.in);
    public int[] insert(int size, int[] arr){
        System.out.print("\nEnter the element to insert in the array: ");
        int element = sc.nextInt();
        System.out.print("\nEnter the position for the element to be inserted: ");
        int position = sc.nextInt();
        for (int i = size; i >= position-1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[position - 1] = element;
        System.out.print("\nNew Array with Inserted Element: ");
        for (int i = 0; i < size+1; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public int[] delete(int size, int[] arr){
        System.out.print("\nEnter the position for the element to be inserted: ");
        int position = sc.nextInt();
        for(int i=position-1; i<size; i++){
            arr[i] = arr[i+1];
        }
        System.out.print("\nNew Array with Deleted Element: ");
        for (int i = 0; i < size-1; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrOprations a = new ArrOprations();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[100];
        System.out.print("Enter the Array Elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Your Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        while(true){
            System.out.println("\n1. Insert to array");
            System.out.println("2. Delete from array");
            System.out.println("3. Exit");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    arr = a.insert(size, arr);
                    size++;
                    break;
                case 2:
                    arr = a.delete(size, arr);
                case 3:
                    System.exit(1);
                default:
                    break;
            }
        }
    }
}