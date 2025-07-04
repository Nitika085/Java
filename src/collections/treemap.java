package collections;

import java.util.Map;
import java.util.TreeMap;

public class treemap {
    public static void main(String[] args){
        TreeMap<Integer,String>tm= new TreeMap<>(Map.of(2,"a",4,"h",5,"l"));
        System.out.println(tm.ceilingKey(3));
        System.out.println(tm);
    }

}
