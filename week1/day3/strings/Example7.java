public class Example7 {
    public static void main(String[] args) {
        String a = "listen";
        String b = "i";
        char res[] = new char[a.length()];

            for(int i=0; i<a.length();i++){
                if(a.charAt(i)!=b.charAt(0)){
                    res[i]=a.charAt(i);
                }
            }
        String result = new String(res);
        System.out.println(result);
    }   
}
