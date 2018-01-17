package com.kodilla.stream;

import com.kodilla.stream.Book.Book;
import com.kodilla.stream.Book.BookDirectory;

import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();
     /*   People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0,1).equals("M"))
                .forEach(System.out::println); */


       /* List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println); */

     /*  Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
               .filter(book -> book.getYearOfPublication() > 2005)
               .collect(Collectors.toMap(Book::getSignature, book -> book));

       System.out.println("# elements: " + theResultMapOfBooks.size());
       theResultMapOfBooks.entrySet().stream()
               .map(entry -> entry.getKey() + ": " + entry.getValue())
               .forEach(System.out::println);*/

     String theResultStringOfBooks = theBookDirectory.getList().stream()
             .filter(book -> book.getYearOfPublication() > 2005)
             .map(Book::toString)
             .collect(Collectors.joining(",\n","<<",">>"));
     System.out.println(theResultStringOfBooks);

    }
}
