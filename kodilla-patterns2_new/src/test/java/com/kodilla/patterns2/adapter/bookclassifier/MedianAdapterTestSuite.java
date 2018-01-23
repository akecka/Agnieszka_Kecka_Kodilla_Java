package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<Book>();
        bookSet.add(new Book("J.K. Rowling", "Harry Potter", 1998, "2000"));
        bookSet.add(new Book("Jo Nesbo", "Pragnienie", 2017, "2017"));
        bookSet.add(new Book("Julian Barnes", "Zgielk czasu", 2018, "2017"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int publicationYearMedian = medianAdapter.publicationYearMedian(bookSet);
        //Then
        System.out.println(publicationYearMedian);
        assertEquals(2017, publicationYearMedian);
    }
}
