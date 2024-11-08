import java.util.Scanner;

public class Example8 {

    // public static int findMissingNumber(int[] arr, int n) {
    //     int expectedSum = (n * (n + 1)) / 2;
    //     int actualSum = 0;
        
    //     for (int num : arr) {
    //         actualSum += num;
    //     }
        
    //     return expectedSum - actualSum;
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array (N): ");
        int n = scanner.nextInt();

        int[] arr = new int[n - 1];

        System.out.print("Enter the elements of the array (space-separated): ");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        
        for (int num : arr) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing Number: " + missingNumber);
    }
}