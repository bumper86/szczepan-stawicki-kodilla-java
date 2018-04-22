package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Pilates", "Nadzwyczajy", 2010, "001-223"));
        bookSet.add(new Book("Pilates", "Nadzwyczajy", 2012, "001-223"));
        bookSet.add(new Book("Pilates", "Nadzwyczajy", 2016, "001-223"));
        bookSet.add(new Book("Pilates", "Nadzwyczajy", 1990, "001-223"));
        MedianAdapter adapter = new MedianAdapter();

        //When
        int mediana = adapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2012, mediana);
    }

}