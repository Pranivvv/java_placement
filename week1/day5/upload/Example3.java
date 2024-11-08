public class Example3{
    public static void main(String[] args) {
        int r = 7;
        int unit = 2;
        int n = 8;
        int arr[]=new int[]{2,8,3,5,7,4,1,2};
        if (arr.length == 0){
            System.out.println(-1);
            System.exit(0);
        }
        int requiredFood = r*unit;
        int suppliedFood = 0;
        int flag = 0;
        for (int i=0; i<n; i++){
            suppliedFood+=arr[i];
            if (suppliedFood>=requiredFood){
                System.out.println(i+1);
                flag=1;
                break;
            }
        }
        if (flag==0){
            System.out.println(0);
        }
    }
}
