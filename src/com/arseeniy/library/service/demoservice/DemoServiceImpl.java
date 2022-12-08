package com.arseeniy.library.service.demoservice;

import com.arseeniy.library.book.Book;
import com.arseeniy.library.library.Library;
import com.arseeniy.library.service.libraryservice.LibraryServiceImpl;


public class DemoServiceImpl implements DemoService {

    private static Library library = Library.getInstance();

    private static LibraryServiceImpl libraryService = new LibraryServiceImpl();

    public static void startTest() {
        //Add new book to library
        libraryService.addBook(library, new Book("Ivan", "123"));
        System.out.println(libraryService.findBookByAuthor(library, "Ivan"));
        System.out.println(libraryService.findBookByTitle(library, "123"));
        System.out.println(libraryService.removeBookByTitle(library,"123"));
        System.out.println(libraryService.findBookByTitle(library, "123"));
    }
}
