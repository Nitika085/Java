package collections;

import java.util.List;
import java.util.TreeSet;

public class treeset {

    public static void main(String[] args){
        TreeSet<Integer> ts=new TreeSet<>(List.of(10,20,30,40));
        ts.add(40);
        System.out.print(ts);


    }
}
