package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashsetdemo {
    public static void main(String[] args){
        LinkedHashSet<String>hs=new LinkedHashSet<>();
        hs.add("r");
        hs.add("a");
        hs.add("h");
        hs.add("g");
        hs.add("b");
        hs.add("n");
        hs.add("c");
        Iterator<String> it=hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
