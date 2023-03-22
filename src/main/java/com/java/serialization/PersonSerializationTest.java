package com.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonSerializationTest {

    public static void main(String[] args) {

        Person person = new Person("Chintan" , "Shah", 35);
        System.out.println("Object before serialization : \n" + person);

        try(ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream("person.obj"))) {
            objectOut.writeObject(person);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        Person deserializedPerson = null;
        try(ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream("person.obj"))) {
            deserializedPerson = (Person) objectIn.readObject();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        System.out.println("\nDeserialized Object : \n" + deserializedPerson);
    }
}
