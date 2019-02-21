package serialization;

import java.io.*;

class Human implements Serializable {
    int age;
    String name;
}

public class app {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "John";
        human.age = 25;
        final String FILE =
                "D:\\Users\\Sergei\\Documents\\JavaProjects\\" +
                        "TestApp\\src\\serializationExperiment\\newFile.bin";
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
