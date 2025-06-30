package Examples;

import java.util.Arrays;

public class ArrayDemo1
{
    public static void main(String[] args) {

        //Declaration
        int[] numbers  = new int[5];
        int[] marks = {70,80,90,95,79};

        System.out.println(marks[0]);
        System.out.println(marks[1]);

        System.out.println("length of array"+marks.length);

        for (int num: marks){
            System.out.println(" using "+num);
        }


        //common Array methods (Using Arrays class)
        System.out.println(Arrays.toString(marks));
        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks));
    }
}
