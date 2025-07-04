package Examples;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {


        PriorityQueue<Character> p = new PriorityQueue<>();

        //Add elements
        p.add('A');
        p.add('B');
        p.add('C');

        System.out.println(p);

        //Get head element

//        System.out.println(p.element());
//        System.out.println(p.peek());

        //retain and remove element from the queue
//        System.out.println(p.remove());
        System.out.println(p);

        System.out.println(p.poll());
    }
}
