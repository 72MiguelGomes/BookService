package com.bookstore.model;

public class Book {

  private String id;

  private String title;

  private int year;

  private String description;

  public Book(String id, String title, int year, String description) {
    this.id = id;
    this.title = title;
    this.year = year;
    this.description = description;
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
}
