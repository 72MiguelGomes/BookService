package com.bookstore.api.controller;

import com.bookstore.model.Book;
import com.bookstore.services.BookService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {

  private final BookService bookService;

  @Autowired
  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping("/{id}")
  public ResponseEntity<Book> getBookById(@PathVariable("id") String bookId) {
    Optional<Book> bookOpt = this.bookService.getBookById(bookId);

    if (!bookOpt.isPresent()) {
      return ResponseEntity.notFound().build();
    }

    return ResponseEntity.ok(bookOpt.get());
  }

  @GetMapping
  public ResponseEntity<List<Book>> getBooks() {
    var booksList = this.bookService.getAllBooks();

    return ResponseEntity.ok(booksList);
  }

}
