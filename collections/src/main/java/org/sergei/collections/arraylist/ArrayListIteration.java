package org.sergei.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteration {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            numbers.add(i);
        }
        
        for (Iterator<Integer> it = numbers.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
}
