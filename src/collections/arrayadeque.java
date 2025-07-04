package collections;

import java.util.ArrayDeque;

public class arrayadeque {
    public static void main(String[] args){
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.offerLast(80);
        dq.offerLast(40);
        dq.offerLast(50);
        dq.offerLast(60);
        dq.poll();
        dq.pollFirst();
        dq.pollLast();
        dq.forEach(n-> System.out.print(n+" "));
        System.out.println();
        dq.offerFirst(110);
        dq.offerFirst(120);
        dq.offerFirst(130);
        dq.offerFirst(140);
        dq.forEach(n-> System.out.print(n+" "));



    }

}
