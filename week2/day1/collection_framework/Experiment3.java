//HashSetDemo
import java.util.*;
class Experiment3 {
    public static void main(String[] args) { 
        TreeSet ts=new TreeSet();
        ts.add("A");
        ts.add("Z");
        ts.add("D");
        ts.add("C");
        ts.add("B");
        //ts.add(10); ClassCastException //ts.add(null); NullPointerException 
        System.out.println(ts);
    }
}