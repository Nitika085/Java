package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.jar.JarOutputStream;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ar1 = new LinkedList<>();
        LinkedList<Integer> ar2 = new LinkedList<>(List.of(20, 30, 40, 50, 60, 70, 80, 90));
        ar1.add(30);
        ar1.add(0, 40);
        System.out.print(ar1+" ");
        ar1.addAll(ar2);
        System.out.println(ar1);
        System.out.println(ar1.contains(509));
        System.out.println(ar1.indexOf(50));
        System.out.println(ar1.get(5));
        ar1.addFirst(4);
        ar1.addLast(4);
        System.out.print(ar1);
        ar1.poll();
        ar1.pop();
        System.out.println(ar1.contains(40)
);
        System.out.println(ar1.peek());
        System.out.print(ar1);
    }
}
