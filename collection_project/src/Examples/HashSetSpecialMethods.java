package Examples;

import java.util.HashSet;

public class HashSetSpecialMethods {

    public static void main(String[] args) {


        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println("set1-"+set1);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("set2-"+set2);

        //union
        //set1.addAll(set2);
        //System.out.println("Union-"+set1);

        //intersection(common)
        //set1.retainAll(set2);
        //System.out.println(set1);

        //difference
        //set1.removeAll(set2);
        //System.out.println(set1);

        //contain all
        System.out.println(set1.containsAll(set2));

    }
}
