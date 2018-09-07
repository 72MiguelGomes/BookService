package com.bookstore.services;

import com.bookstore.model.Book;
import java.util.List;
import java.util.Optional;
import javax.validation.constraints.NotNull;

public interface BookService {

  @NotNull
  List<Book> getAllBooks();

  @NotNull
  Optional<Book> getBookById(@NotNull String id);

}
