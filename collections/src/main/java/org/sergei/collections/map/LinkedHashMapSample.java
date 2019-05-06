package org.sergei.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapSample {

    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Value one");
        map.put(2, "Second value");
        map.put(3, "Third value");
        map.put(4, "Fourth value");
        map.put(5, "Fifth value");
        
        Set<Integer> keys = map.keySet();
        System.out.println(keys.toString());
        
    }
    
}
