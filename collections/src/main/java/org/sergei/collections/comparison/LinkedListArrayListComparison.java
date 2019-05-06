package org.sergei.collections.comparison;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Main difference between LinkedList and ArrayList is that in LinkedList
 * elements are connected using references next, prev while in ArrayList is a
 * dynamic array where all elements are stored into the array.
 * <p>
 * Another facts: LinkedList is faster due to array is not needed
 * </p>
 * <p>
 * When to use each of those: Insert and remove operations are faster in
 * LinkedList. O(1) And if it is required to frequently add or remove elements
 * LinkedList gonna be the best choice Search operation in ArrayList if faster
 * O(1) and if there are not quiet much operations to frequently add and remove
 * elements than an ArrayList gonna be the best choice
 * </p>
 * <p>
 * The key difference is that when we need to insert element in between the
 * ArrayList it takes more time in comparison with LinkedList due to an
 * ArrayList is an array and there need to copy the other part of the array
 * while in LinkedList we can quickly insert elements in between due to the
 * references and node that exists
 * </p>
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
