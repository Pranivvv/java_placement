//Stock Span

import java.util.*;
class Example5{
    public static void main(String args[]){
        int price[] ={100,80,60,70,60,75,85};
        int ans[] = new int[price.length];
        for(int i=1; i<price.length;i++){
            if(price[i-1]<price[i]){
                ans[i]=2*2*2;
            }else{
                ans[i]=1;
            }
        }
        price[0]=1;
        System.out.println(Arrays.toString(ans));
    }
}