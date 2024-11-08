import java.util.Scanner;

public class BinarySearch {
    public int[] insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int loc = i-1;
            while(loc>=0 && arr[loc]>temp) {
                arr[loc+1]=arr[loc];
                loc--;
            }
            arr[loc+1]=temp;
        }
        return arr;
    }

    public int[] arrayInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the Array Elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
