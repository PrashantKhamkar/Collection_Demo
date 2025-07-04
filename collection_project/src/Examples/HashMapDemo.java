package Examples;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer,String> m = new HashMap<>();

        m.put(101,"Prashant");
        m.put(102, "Sushant");
        m.put(103, "asish");
        m.put(104, "akshay");
        m.put(105, "sanket");
        m.put(106, "vishal");

        System.out.println(m);

        //get values
        System.out.println(m.get(101));

        //remove pair from hashmap
        m.remove(104);
        System.out.println(m);

        //check key present in hashmap
        System.out.println(m.containsKey(101));

        //check value present in hashmap
        System.out.println(m.containsValue("Prashant"));

        //check hashmap is empty or not
        System.out.println(m.isEmpty());

        //return all keyset
        System.out.println(m.keySet());

        //return all valueset
        System.out.println(m.values());

        //return all key and value set
        System.out.println(m.entrySet());

        //print all key individual
        for (Object i: m.keySet()){
            System.out.println(i);
        }

        //print all values individual
        for (Object i:m.values()){
            System.out.println(i);
        }

        //print key and values individual
        for (Object i:m.keySet()){
            System.out.println(i+"-"+m.get(i));
        }
    }
}
