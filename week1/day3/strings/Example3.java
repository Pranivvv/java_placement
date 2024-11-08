//Edit Distance
class Example3{
    public static void main(String args[]){
        String s = "ycce";
        String t = "ycsce";

        int lenOfS = s.length();
        int lenOft = t.length();
        int ans = 0;
        if(lenOfS > lenOft){
            ans = lenOfS - lenOft;
        } 
        else if(lenOft > lenOfS){
            ans = lenOft - lenOfS;
        } 
        else if(lenOfS == lenOft){
            for(int i=0; i<lenOfS; i++){
                if(s.charAt(i)!=t.charAt(i)){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}