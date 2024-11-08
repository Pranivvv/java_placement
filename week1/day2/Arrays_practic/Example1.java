//amazon  next larger element
import java.util.*;
class Example1{
    public static void main(String args[]){
        int n=4;
        int arr[]={1,3,2,4,3};
        int res[] = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            if(i==arr.length-1){
                res[i]=-1;
            }
            else{
                for(int j=i+1; j<arr.length; j++){
                    if(arr[i]<arr[j]){
                        res[i]=arr[j];
                        break;
                    }else{
                        res[i]=-1;
                    }
                    }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}