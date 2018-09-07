package com.bookstore.model;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Author {

  private final String id;

  private final String firstName;

  private final String lastName;

  private final LocalDate birthday;

}
