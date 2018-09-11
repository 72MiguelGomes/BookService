package com.bookstore.model;

import java.util.HashSet;
import java.util.Set;

public class Book {

  private final String id;

  private final String title;

  private final int year;

  private final String description;

  private final Set<Author> authors;

  public Book(String id, String title, int year, String description, Set<Author> authors) {
    this.id = id;
    this.title = title;
    this.year = year;
    this.description = description;
    this.authors = authors;
  }

  public String getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public int getYear() {
    return year;
  }

  public String getDescription() {
    return description;
  }

  public Set<Author> getAuthors() {
    return new HashSet<>(authors);
  }
}
