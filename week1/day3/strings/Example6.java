//anagram

import java.util.*;
class Example6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        char ar1[] = s1.toLowerCase().toCharArray();
        char ar2[] = s2.toLowerCase().toCharArray();
        if(s1.length()==s2.length()){
            for(int i=0;i<s1.length(); i++){
                for(int j=0;j<s1.length()-1;j++){
                    if(ar1[j]>ar1[j+1]){
                        char temp=ar1[j];
                        ar1[j]=ar1[j+1];
                        ar1[j+1]=temp;
                    }
                    if(ar2[j]>ar2[j+1]){
                        char temp=ar2[j];
                        ar2[j]=ar2[j+1];
                        ar2[j+1]=temp;
                    }
                }
            }
            String str1 = Arrays.toString(ar1);
            String str2 = Arrays.toString(ar2);
            if(str1.equals(str2)){
                System.out.println("string are anagram");
            }
            else{
                System.out.println("string are not anagram");
            }
        }
        else{
            System.out.println("string are not anagram");
        }
    }
}