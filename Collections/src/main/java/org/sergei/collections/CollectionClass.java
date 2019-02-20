package org.sergei.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionClass {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Hello!");
        collection.add("World!");
        System.out.println(collection.contains("Hello!"));
    }
}
