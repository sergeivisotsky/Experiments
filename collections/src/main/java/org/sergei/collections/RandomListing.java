package org.sergei.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomListing {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Marina", "Denis", "Douglas", "Vincent");
        List<String> pages = Arrays.asList("blog", "magazine", "journal", "news", "feed");

        String rName = names.get(new Random().nextInt(names.size()));
        String rPage = pages.get(new Random().nextInt(pages.size()));

        System.out.println(rName);
        System.out.println(rPage);
    }
}
