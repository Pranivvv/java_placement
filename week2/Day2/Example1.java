import java.util.Scanner;

public class Example1 {
    public int[] insertionSort(String[] arr){
        for (int i = 1; i < arr.length; i++) {
            String temp = arr[i];
            int loc = i-1;
            while(loc>=0 && arr[loc]temp) {
                arr[loc+1]=arr[loc];
                loc--;
            }
            arr[loc+1]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String[] mbl = new String[10];
        System.out.println("Enter 10 mobile numbers");
        for(int i=0; i<10; i++){
            System.out.println("Enter number "+i);
            mbl[i] = sc.next();
        }

        for(int i=0; i<10; i++){
            String temp = mbl[i];
            if(temp.length() != 10){
                System.out.println("Mobile no at index " +(i+1)+" is invalid");
            }
        }

        mbl = insertionSort(mbl[]);

    }
}
