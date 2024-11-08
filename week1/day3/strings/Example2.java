class Example2{
    public static void main(String args[]){
        String s = "praniv";
        char ar = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            ar[i]=s.charAt(i);
        }
        for(int i=0,j=s.length(); i<j; i++,j--){
            char temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }
    }
}