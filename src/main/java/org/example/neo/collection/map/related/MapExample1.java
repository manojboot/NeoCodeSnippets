package org.example.neo.collection.map.related;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("neo",27);
        map.put("nehu",33);
        map.put("chitrangda",14);
        map.put("jack",21);
        map.put("keanu",25);
        System.out.println(map);
        for(Map.Entry<String,Integer> m : map.entrySet()){
            System.out.println("Key : " +m.getKey() +" for Value :" +m.getValue());
        }
    }
}
