package org.sergei.collections.comparison;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Main difference between LinkedList and ArrayList is that in LinkedList elements are connected using
 * references next, prev while in ArrayList is a dynamic array where all elements are stored into the array.
 * Another facts:
 * LinkedList is faster due to array is not needed
 *
 * @author Sergei Visotsky
 */
public class LinkedListArrayListComparison {
    public static void main(String[] args) {

        // LinkedList study
        LinkedList<String> linkedElements = new LinkedList<>();
        linkedElements.add("one");
        linkedElements.add("two");
        linkedElements.add("three");

        linkedElements.add(1, "eleven");

        System.out.println("LinkedList result: " + linkedElements.toString());

        // ArrayList study
        List<String> arrayElements = new ArrayList<>();

        arrayElements.add("one");
        arrayElements.add("two");
        arrayElements.add("three");
        arrayElements.add("four");

        arrayElements.add(2, "eleven");

        System.out.println("ArrayList result: " + arrayElements.toString());
    }
}
