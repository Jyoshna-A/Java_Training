package com.celcom.day5;
import java.util.*;



import java.util.ArrayList;
import java.util.List;

class Book {
    
     String title;
     String author;
     String isbn;

    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    
    public String write() {
        return "Title: " + title + "Author: " + author + "ISBN: " + isbn ;
    }
}

class Store {
    List<Book> store= new ArrayList<>();

    
    public void addBook(Book book) {
        store.add(book);
        System.out.println("Book added: " + book.write());
    }

    public void removeBook(String isbn) {
        Book bookToRemove = null;
        for (Book book : store) {
            if (book.getIsbn().equals(isbn)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            store.remove(bookToRemove);
            System.out.println("Book removed: " + bookToRemove.write());
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }    
    
    public void displayBooks() {
        
            System.out.println("Books in the collection:");
            for (Book book : store) {
                System.out.println(book.write());
            }
        
    }
}

public class Assignment5 {
    public static void main(String[] args) {
        
        Store store = new Store();

        
        Book book1 = new Book("Book1 ", "A ", "978");
        Book book2 = new Book("Book2 ", "B ", "278");
        Book book3 = new Book("Book3 ", "C ", "324");

        
        store.addBook(book1);
        store.addBook(book2);
        store.addBook(book3);

        
        store.displayBooks();

        
   
    }
}

