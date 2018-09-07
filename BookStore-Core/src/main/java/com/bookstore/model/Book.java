package com.bookstore.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Book {

  private String id;

  private final String title;

  private final int year;

  private final String description;

}
