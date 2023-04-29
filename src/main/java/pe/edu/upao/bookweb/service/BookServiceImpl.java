package pe.edu.upao.bookweb.service;

import org.springframework.stereotype.Service;
import pe.edu.upao.bookweb.domain.Book;
import pe.edu.upao.bookweb.repository.BookRepository;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository)
    {
        this.bookRepository = bookRepository;
    }



    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book createBook(Book book){
        return bookRepository.save(book);
    }
}
