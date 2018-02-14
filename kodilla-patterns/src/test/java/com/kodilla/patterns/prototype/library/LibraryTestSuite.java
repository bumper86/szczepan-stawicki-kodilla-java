package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("Secrests of Alamo", "John Smith", LocalDate.of(2008,10,12));
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", LocalDate.of(2012,05,13));
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", LocalDate.of(2016, 02,03));
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", LocalDate.of(2010,12,14));

        Library library = new Library("Poznan UAM");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Poznan AE");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            clonedLibrary.setName("Poznan UE");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book2);
        //then
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
    }
}
