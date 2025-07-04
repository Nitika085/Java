package collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class mycom implements Comparator<Integer>{
    public int compare(Integer o1,Integer o2){
    if(o1<o2)return 1;
    if(o2<o1)return -1;
    return 0;

    }
}

public class priority_queue {
    public static  void main(String[] args){
        PriorityQueue<Integer> pq=new PriorityQueue<>();//default min
        PriorityQueue<Integer> pq1=new PriorityQueue<>(new mycom() );//comapartor and make this as max heap
//        pq.add(5);
//        pq.add(8);
//        pq.add(9);
//        pq.add(70);
//        System.out.println(pq.peek());
//        Iterator<Integer> it=pq.iterator();
//        while (it.hasNext()){
//            System.out.print(it.next()+" ");
//        }
//        pq.poll();
//        System.out.println();
//        pq.forEach((x)-> System.out.print(x+" "));
        System.out.println();
        pq1.add(5);
        pq1.add(8);
        pq1.add(9);
        pq1.add(70);
        System.out.println(pq1.peek());
        Iterator<Integer> it1=pq1.iterator();
        while (it1.hasNext()){
            System.out.print(it1.next()+" ");
        }
        pq1.poll();

    }

}
