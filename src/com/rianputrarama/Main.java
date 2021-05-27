package com.rianputrarama;

import com.rianputrarama.object.Employee;
import com.rianputrarama.object.PrintObject;

public class Main {

    public static void main(String[] args) {
        PrintObject printObject = new PrintObject();
        Employee employee1 = new Employee();
        employee1.setName("Tiara");
        employee1.setRole("Software Engineer");
        printObject.printTextToConsole(employee1.getName(), employee1.getRole());
        printObject.printTextToConsole(employee1.getName(), employee1.replaceWordInText("Designer"));
    }
}
