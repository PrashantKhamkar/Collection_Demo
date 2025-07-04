package Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student3{
    String name;
    int age;

    Student3(String name,int age){
        this.name =name;
        this.age=age;
    }

    public String toString(){
        return name+"("+age+")";
    }
}
class NameComparator implements Comparator<Student3> {
    public int compare(Student3 s1, Student3 s2) {
        return s1.name.compareTo(s2.name);
    }
}


public class ComparatorInterfaceExample{
    public static void main(String[] args) {

        ArrayList<Student3> list = new ArrayList<>();
        list.add(new Student3("Prashant", 27));
        list.add(new Student3("Rahul", 22));
        list.add(new Student3("Amit", 25));

        // Sort using Comparator
        Collections.sort(list,new NameComparator());

        for (Student3 s : list) {
            System.out.println(s);
        }
    }
}
