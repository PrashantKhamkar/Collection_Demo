package Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Object> a1=new ArrayList<>();

        a1.add(100);
        a1.add("Amit");
        a1.add(1.5);
        a1.add('A');

        System.out.println(a1);

        //remove element from index 0
//        a1.remove(0);

        //Add element at index 1
//        a1.add(1,10);
//        System.out.println(a1);
//
//        System.out.println(a1.get(0));
//        System.out.println(a1.contains("Amit"));
//        System.out.println(a1.isEmpty());

        //Read elements from array

//        for (int i =0;i<a1.size();i++){
//            System.out.println(a1.get(i));
//        }

//        for(Object e:a1){
//            System.out.println(e);
//        }

//        Iterator<Object> it=a1.listIterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        ArrayList<Object> ar = new ArrayList<>();

        ar.addAll(a1);
        System.out.println(ar);
        ar.removeAll(a1);
        System.out.println(ar);

        ArrayList<String> al=new ArrayList<>();

        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");
        //sorting element assending
        Collections.sort(al);
        System.out.println(al);
        //sorting element in decending
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);

        //arrange element in random order
        Collections.shuffle(al);
        System.out.println(al);


    }
}
