package org.sergei.investigation.lambda;

public class BookCreator {
    PaperCreator paperCreatorObject = () -> System.out.println("Create paper and book!!!");
}
