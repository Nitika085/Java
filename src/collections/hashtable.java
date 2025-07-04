package collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class hashtable {
    public static void main(String[] args){
        Hashtable hs=new Hashtable<>();
        hs.put(1,"q");
        hs.put(2,"w");
        hs.put(3,"r");
        hs.put(4,"h");
        hs.put(5,"j");
        hs.put(6,"k");
        hs.put(7,"c");
//        Enumeration e=hs.elements();
//        while(e.hasMoreElements()){
//            System.out.println(e.nextElement());
//        }
        hs.compute(1,(k,v)->"s"+k);
        hs.computeIfAbsent(9,(k)->"o");
        System.out.println(hs);
    }
}
