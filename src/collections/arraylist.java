package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.jar.JarOutputStream;

public class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> ar1=new ArrayList<>(20);
        ArrayList<Integer> ar2=new ArrayList<>(List.of(20,30,40,50,60,70,80,90));
        ar1.add(30);
        ar1.add(0,40);
        ar1.addAll(ar2);
        System.out.println(ar1);
        System.out.println( ar1.contains(509));;
        System.out.println( ar1.indexOf(50));
        System.out.println( ar1.get(5));
//        ar1.stream().forEach(System.out::print);
//        System.out.println();
//        for(int i=0;i<ar1.size();i++){
//            System.out.print(ar1.get(i)+ " ");}
//        System.out.println();
//
//        for (var x:ar1){
//            System.out.print(x+" ");}
//        System.out.println();
//
//        Iterator<Integer> it=ar1.iterator();
//        while(it.hasNext()){
//            System.out.print(it.next());
//
//        }
        for(ListIterator<Integer> it1= ar2.listIterator();it1.hasNext();  ){
            System.out.print(it1.next()+" ");
        }
        System.out.println();
        ar1.forEach(n->show(n));
    }
    static void show(int n){
        if(n>40){
            System.out.print(n+" ");
        }
    }


}
