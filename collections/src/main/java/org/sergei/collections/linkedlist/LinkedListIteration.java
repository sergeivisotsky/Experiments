package org.sergei.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListIteration {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        for (int i = 0; i <= 20; i++) {
            numbers.add(i);
        }
        
        for (Iterator<Integer> it = numbers.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
    
}
