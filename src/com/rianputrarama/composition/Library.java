package com.rianputrarama.composition;

import java.util.List;

public class Library {

    // referensi list dari book
    private final List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    // total banyak buku
    public List<Book> getTotalBookListInLibrary() {
        return books;
    }

}
