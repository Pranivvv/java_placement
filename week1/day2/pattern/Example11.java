// 1    10
// 2    9
// 4    7   
// 5    6     
import java.util.*;
class Example11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x=11;
        for(int i=1,j=10; i<j; i++, j--){
            if(i==3){
                continue;
            }else{
            System.out.println(i+"  "+j);
            }
        }
    }
} 