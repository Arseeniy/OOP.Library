package com.arseeniy.library.service.libraryservice;

import com.arseeniy.library.book.Book;
import com.arseeniy.library.library.Library;



public class LibraryServiceImpl implements LibraryService {



    @Override
    public void addBook(Library library, Book book) {
        library.getBookList().add(book);
    }

    @Override
    public String findBookByTitle(Library library, String title) {
        for (Book book : library.getBookList()) {
            if (book.getTitle().equals(title)) {
                return "Your book is: " + book.getAuthor() + " \"" + book.getTitle()+"\"";
            }
        }
        return "Sorry, there is no such book in the library";
    }

    @Override
    public String findBookByAuthor(Library library, String author) {
        for (Book book : library.getBookList()) {
            if (book.getAuthor().equals(author)) {
                return "Your book is: " + book.getAuthor() + " \"" + book.getTitle()+"\"";
            }
        }
        return "Sorry, there is no such book in the library";
    }

    @Override
    public String removeBookByTitle(Library library, String title) {
        for (Book book : library.getBookList()) {
            if (book.getTitle().equals(title)) {
                library.getBookList().remove(book);
                return "Your book was successfully removed";
            }
        }
        return "Sorry, there is no such book in the library";
    }

    @Override
    public String removeBookByAuthor(Library library, String author) {
        for (Book book : library.getBookList()) {
            if (book.getAuthor().equals(author)) {
                library.getBookList().remove(book);
                return "Your book was successfully removed";
            }
        }
        return "Sorry, there is no such book in the library";
    }
}
