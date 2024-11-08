import java.util.Scanner;

public class LinearSearch {
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

    public int linearSearch(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearSearch l = new LinearSearch();
        int[] arr = l.arrayInput();
        arr = l.insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i +" ");
        }
        System.out.print("enter element to search : ");
        int key = sc.nextInt();
        int pos = l.linearSearch(arr,key);
        if (pos!=-1){
            System.out.println("element is present at position "+ pos+1);
        }
        else{
            System.out.println("element is not present");
        }
    }
}
