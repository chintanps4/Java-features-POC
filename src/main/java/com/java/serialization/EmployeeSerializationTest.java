package com.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerializationTest {

    public static void main(String[] args) {

        Person person = new Person("Chintan" , "Shah", 35);
        Employee employee = new Employee();
        employee.setEmployee(person);
        employee.setDepartment("I.T.");
        employee.setEmployeeCode("100");

        try(ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream("employee.obj"))) {
            objectOut.writeObject(employee);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        Employee deserializedEmployee = null;
        try(ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream("employee.obj"))) {
            deserializedEmployee = (Employee) objectIn.readObject();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        System.out.println("\nDeserialized Object : \n" + deserializedEmployee);
    }
}
