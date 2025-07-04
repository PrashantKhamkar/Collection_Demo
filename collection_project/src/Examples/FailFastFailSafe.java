package Examples;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastFailSafe {

    public static void main(String[] args) {

        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();

        map.put("mohan",101);
        map.put("Ram",102);
        map.put("Jay",103);

        for (String s:map.keySet()){
            System.out.println(s+":"+map.get(s));
            map.put("Babu",104);
        }
    }
}
