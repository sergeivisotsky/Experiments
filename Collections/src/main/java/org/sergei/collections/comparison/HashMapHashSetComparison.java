package org.sergei.collections.comparison;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * The first difference that I discovered is that in HashMap we are able to use key-value
 * while in HashSet we can hold just only value without key. And what is obvious in HshSet we cannot use Map interface
 * due to is allows to use only key-value byt HashSet allows to hold values only.
 * <p>
 * HashMap implemented by Map interface
 *
 * @author Sergei Visotsky
 */
public class HashMapHashSetComparison {
    public static void main(String[] args) {

        // HashMap section
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Test 1");
        hashMap.put(2, "Test 2");
        hashMap.put(3, "Test 3");

        // HashSet section
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.forEach(System.out::println);
    }
}
