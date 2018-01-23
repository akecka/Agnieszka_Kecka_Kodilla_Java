package com.kodilla.patterns2.adapter.bookclasifier;


import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Statistics statistics = new Statistics();

        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        for (Book book : bookSet) {
            com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book bookb =
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(
                            book.getAuthor(), book.getTitle(), book.getPublicationYear());
            books.put(new BookSignature(book.getAuthor()), bookb);
        }
        return statistics.medianPublicationYear(books);
    }
}
