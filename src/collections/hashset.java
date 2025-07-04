package collections;

import java.util.HashSet;

public class hashset {
    public static void main(String[] str){
        HashSet<Integer> hs=new HashSet<>();
        hs.add(20);
        hs.add(30);
        hs.add(40);
        System.out.print(hs);
        System.out.println();
        hs.add(20);
        System.out.print(hs);

    }
}
