//cap
import java.util.*;
class Example3{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of Semester: ");
        int n = s.nextInt();
        int max1=0;
        int sub[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter no of subjects in "+(i+1)+" semester: ");
            int size = s.nextInt();
            sub[i] = size;
        }
        int max=sub[0];
        for(int i=1;i<sub.length;i++){
            if(max<sub[i]){
                max=sub[i];
            }
        }
        int marks[][]= new int[n][max];
        for(int i=0;i<n;i++){
            System.out.println("Marks obtained in Semester "+(i+1)+":");
            for(int j=0;j<sub[i];j++){
                marks[i][j]= s.nextInt();
                if(marks[i][j]>100 || marks[i][j]<0){
                    System.out.println("You have entered invalid marks.");
                    System.exit(0);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<sub[i];j++){
                max1 = marks[i][j-1];
                if(max<marks[i][j]){
                max1=marks[i][j];
            }
            }
            System.out.println("Maximum marks in"+(i+1)+":"+max1);
        }
    }
}
