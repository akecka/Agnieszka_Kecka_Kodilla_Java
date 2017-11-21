package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("Harry Potter", "J.K.Rowling", LocalDate.of(2009, 6, 1));
        Book book2 = new Book("Millennium", "Stieg Larsson", LocalDate.of(2007, 7, 12));
        Book book3 = new Book("Gridiron", "Philip Kerr", LocalDate.of(1995, 6, 1));
        Book book4 = new Book("What I think when I think about running", "Haruki Murakami", LocalDate.of(1985, 6, 1));

        Library library = new Library("Hooter");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.getName();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.getName();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        //Then
        library.printBooks();
        clonedLibrary.printBooks();
        deepClonedLibrary.printBooks();
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());

    }

}
