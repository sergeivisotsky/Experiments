package org.sergei.investigation.experiments;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class SomeClass {

    private String someField;

    public SomeClass(String someField) {
        this.someField = someField;
    }

    private String getSomething() {
        System.out.println(someField);
        return someField;
    }
    
    public void getSomethingMethod() {
        getSomething();
    }
    
}

public class Reflection {

    public static void main(String[] args) throws Exception {
        SomeClass someClass = new SomeClass("Hello");
        Class<? extends SomeClass> class1 = someClass.getClass();
        Field fieldOne = class1.getDeclaredField("someField");
        Method[] methods = class1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.toString());
        }
        fieldOne.setAccessible(true);
        Method getSmthMethod = class1.getDeclaredMethod("getSomething");
        getSmthMethod.setAccessible(true);
        getSmthMethod.invoke(someClass);
    }
    
}
