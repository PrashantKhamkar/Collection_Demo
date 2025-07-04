package Examples;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {


        //default capacity :16 , load Factor 0.75

        //  HashSet<Object> hs = new HashSet<>(100,(float)0.95); //capacity 100 and load factor 0.95

        HashSet<Object> hs = new HashSet<>();

        hs.add("welcome");
        hs.add(100);
        hs.add('A');
        hs.add("prashant");
        hs.add(1.5);

        System.out.println(hs);

        // Remove element
        hs.remove(1.5);
        System.out.println(hs);

        //contains an element
        System.out.println(hs.contains("prashant"));

        //reading element from hashset using for:each loop

        for (Object e:hs){
            System.out.print(e+"|");
        }

        System.out.println();

        Iterator<Object> it = hs.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+"--");
        }
    }
}
