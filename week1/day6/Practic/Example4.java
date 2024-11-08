import java.lang.reflect.Array;
import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {
        int a1[] = {1,2,3,9};
        int a2[] = {2,4,6,5};
        int res1[] = new int[a1.length];
        int res2[] = new int[a2.length];
        int x=0,y=0;
        for(int i = 0; i<a1.length; i++){
            boolean flag =false;
            for(int j = 0; j<a2.length; j++){
                if(a1[i] == a2[j]){
                    flag = false;
                    break;
                }
                else{
                    flag = true;
                }
            }     
            if(flag){
                res1[x]=a1[i];
                x++;
            }   
        }
        for(int i = 0; i<a2.length; i++){
            boolean flag =false;
            for(int j = 0; j<a1.length; j++){
                if(a1[i] == a2[j]){
                    flag = false;
                    break;
                }
                else{
                    flag = true;
                }
            }    
            if(flag){
                res2[y]=a2[i];
                y++;
            }       
        }
        System.out.println(Arrays.toString(res1));
        System.out.println(Arrays.toString(res2));
    }
}
