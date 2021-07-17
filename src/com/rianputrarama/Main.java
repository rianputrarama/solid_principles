package com.rianputrarama;

import com.rianputrarama.composition.Book;
import com.rianputrarama.composition.Library;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // contoh composition
        Book b1 = new Book("Effective Java", "Joshua Bloch");
        Book b2 = new Book("Clean Code", "Robert C Martin");

        // membuat list buku
        List<Book> book = new ArrayList<Book>();
        book.add(b1);
        book.add(b2);

        Library l1 = new Library(book);
        List<Book> books = l1.getTotalBookListInLibrary();
        for (Book bk : books) {
            System.out.println("Title : " + bk.title
                    + " and "
                    + " Author : " + bk.author);
        }


        /*PrintObject printObject = new PrintObject();
        Employee employee1 = new Employee();
        employee1.setName("Tiara");
        employee1.setRole("Software Engineer");
        printObject.printTextToConsole(employee1.getName(), employee1.getRole());
        printObject.printTextToConsole(employee1.getName(), employee1.replaceWordInText("Designer"));*/
    }
}
