package Examples;

import java.util.LinkedList;

public class LinkedListSpecialMethod {
    public static void main(String[] args) {

        LinkedList<String> l=new LinkedList<>();

        l.add("dog");
        l.add("boxer");
        l.add("cat");
        l.add("ox");
        l.add("mouse");

        System.out.println(l);

        l.addFirst("Tiger");
        System.out.println(l);

        l.addLast("Lion");
        System.out.println(l);

        l.removeFirst();
        System.out.println(l);

        l.removeLast();
        System.out.println(l);

        System.out.println(l.getFirst());
        System.out.println(l.getLast());
    }
}
