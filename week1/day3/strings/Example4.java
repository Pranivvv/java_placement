class Example4{
    
    public static void main(String args[]){
        Example4 e1 = new Example4();
        Example4 e2 = new Example4();
        System.out.println(e1==e2);
        String s1="praniv";
        String s2 ="praniv";
        System.out.println(s1==s2);
        String s3= new String("praniv");
        String s4 =new String("praniv");
        System.out.println(s3==s4);
    }
}