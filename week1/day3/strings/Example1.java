// Boolean endswith(string str)
class Example1{
    public static void main(String args[]){
        String s = "praniv";
        System.out.println(s.endsWith("v"));
        System.out.println(s.endsWith("iv"));
        System.out.println(s.endsWith("nIv"));
        System.out.println(s.endsWith("isv"));
    }
}