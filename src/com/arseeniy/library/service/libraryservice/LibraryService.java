package com.arseeniy.library.service.libraryservice;

import com.arseeniy.library.book.Book;
import com.arseeniy.library.library.Library;

public interface LibraryService {

    public void addBook(Library library, Book book);

    public String findBookByTitle(Library library, String title);

    public String findBookByAuthor(Library library, String author);

    public String removeBookByTitle(Library library, String title);

    public String removeBookByAuthor(Library library,  String author);
}
