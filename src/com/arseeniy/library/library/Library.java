package com.arseeniy.library.library;


import com.arseeniy.library.book.Book;

import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book> bookList = new ArrayList<>();
    private static Library library;

    private Library() {
    }

    public static Library getInstance() {
        if (library == null) {
            return library = new Library();
        }
        return library;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
