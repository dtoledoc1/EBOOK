package pe.edu.upao.bookweb.controller;


import pe.edu.upao.bookweb.domain.Book;
import pe.edu.upao.bookweb.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }



    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        return new ResponseEntity<Book>(bookService.createBook(book), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        return  ResponseEntity.ok((List<Book>) bookService.getAllBooks());
    }
}
