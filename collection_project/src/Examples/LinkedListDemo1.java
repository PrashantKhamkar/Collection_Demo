package Examples;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {


        LinkedList<Object> l= new LinkedList<>();

        l.add(10);
        l.add(100);
        l.add("Prashant");
        l.add('P');
        l.add(null);

        System.out.println(l);
        System.out.println(l.size());

        //Rmoeve
        l.remove(0);
        System.out.println(l);

        //Insert--adding element at midle of linkedlist
        l.add(3,"Khamkar");
        System.out.println(l);

        //retriving the value from linkedlist
        System.out.println(l.get(1));

        //change the value
        l.set(0,1000);
        System.out.println(l);

        //contains
        System.out.println(l.contains("Java"));

        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i)+" ");
        }

        for (Object e:l){
            System.out.print(e+" ");
        }

        Iterator<Object> it = l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
