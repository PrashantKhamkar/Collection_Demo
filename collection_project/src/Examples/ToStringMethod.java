package Examples;

class Student{

    int id;
    String name;

    Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    public String toString(){
        return id+" "+name;
    }

}
public class ToStringMethod {

    public static void main(String[] args) {


        Student s1 = new Student(101,"Raj");
        Student s2 = new Student(102,"Amit");

        System.out.println(s1);
        System.out.println(s2);
    }
}
