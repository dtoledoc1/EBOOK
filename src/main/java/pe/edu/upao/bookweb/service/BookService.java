package pe.edu.upao.bookweb.service;

import pe.edu.upao.bookweb.domain.Book;

import java.util.List;

public interface BookService {
    Book createBook(Book book);
    List<Book> getAllBooks();
}
