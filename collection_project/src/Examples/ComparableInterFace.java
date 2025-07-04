package Examples;

import java.util.ArrayList;
import java.util.Collections;

class Student1 implements Comparable<Student1>{
    String name;
    int age;

    Student1(String name, int age){
        this.name=name;
        this.age=age;
    }

    //Implement CompareTO method
    public int compareTo(Student1 s){
        return this.age-s.age;
    }

    // Override toString to print name and age
    public String toString() {
        return name + " (" + age + ")";
    }
}
public class ComparableInterFace {


    public static void main(String[] args) {


        ArrayList<Student1> list = new ArrayList<>();
        list.add(new Student1("Prashant",27));
        list.add(new Student1("Rahul",22));
        list.add(new Student1("Amit",25));

        Collections.sort(list);//uses compareTO internally


        for (Student1 s: list){
            System.out.println(s);
        }
    }
}
