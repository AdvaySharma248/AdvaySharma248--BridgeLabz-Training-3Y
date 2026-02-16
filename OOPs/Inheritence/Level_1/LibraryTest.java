package com.bridgelabz.inheritance;
class Book {
    String title; int publicationYear;
    Book(String title, int publicationYear) {
        this.title = title; this.publicationYear = publicationYear;
    }
}
class Author extends Book {
    String name; String bio;
    Author(String title, int publicationYear, String name, String bio) {
        super(title,publicationYear); this.name = name; this.bio = bio;
    }
    void displayInfo() {
        System.out.println("Book: " + title + " (" + publicationYear + ")");
        System.out.println("Author: " + name + " - " + bio);
    }
}
public class LibraryTest {
    public static void main(String[] args) {
        Author a = new Author("Effective Java",2018,"Joshua Bloch","Java Expert");
        a.displayInfo();
    }
}
