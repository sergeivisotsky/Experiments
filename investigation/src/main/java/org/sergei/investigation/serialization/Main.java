package org.sergei.investigation.serialization;

import java.io.*;

class Human implements Serializable {

    private static final long serialVersionUID = 1L;
    
    int age;
    String name;
}

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "John";
        human.age = 25;
        final String FILE = "src/main/resources/files/newFile.bin";
//        Serialization
        try {
            FileOutputStream fileOutputStream =
                    new FileOutputStream(FILE);

            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(human);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        Deserialization
        try {
            FileInputStream fileInputStream =
                    new FileInputStream(FILE);
            ObjectInputStream objectInputStream =
                    new ObjectInputStream(fileInputStream);
            Human newHuman = (Human) objectInputStream.readObject();
            fileInputStream.close();

            System.out.println(newHuman.name);
            System.out.println(newHuman.age);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
