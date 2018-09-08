package com.bookstore.services.impl;

import com.bookstore.model.Book;
import com.bookstore.services.BookService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.IntStream;
import javax.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

  //This is just for test
  private final Map<String, Book> books = new HashMap<>();

  {
    IntStream.range(1, 11)
        .mapToObj(i ->
            Book.builder()
                .id(UUID.randomUUID().toString())
                .description("Book Description: " + i)
                .title("Book " + i)
                .build()
        ).forEach(book -> books.put(book.getId(), book));
  }

  @Override
  public @NotNull List<Book> getAllBooks() {
    return new ArrayList<>(books.values());
  }

  @Override
  public @NotNull Optional<Book> getBookById(@NotNull String id) {
    return Optional.ofNullable(books.get(id));
  }
}
