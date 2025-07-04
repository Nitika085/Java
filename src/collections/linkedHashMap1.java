package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap1 {
    public static void main(String[] args){
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5,0.75f,true){
//            @Override
//            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
//                return size()>5;
//            }
        };
        lhm.put(1,"a");
        lhm.put(2,"b");
        lhm.put(3,"c");
        lhm.put(4,"d");
        lhm.put(5,"e");
        System.out.println(lhm.get(5));
        System.out.println(lhm.get(1));
        lhm.put(6,"g");
        lhm.forEach((x,y)-> System.out.println("Key"+x+"Value"+y));

    }
}
//accessingorder: true give element on the based of accesing(jo least recently used hai vo pehle dikhega and jo frequently used hai vo pehle dikhega
//accessingorder: false give element on the based of insertion(jo pehle insert huya vo sbse pehle dikhega
//
