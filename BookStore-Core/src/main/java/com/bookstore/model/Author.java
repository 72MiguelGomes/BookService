package com.bookstore.model;

import java.time.LocalDate;

public class Author {

  private String id;

  private String firstName;

  private String lastName;

  private LocalDate birthday;

  public Author(String id, String firstName, String lastName, LocalDate birthday) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthday = birthday;
  }

  public String getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public LocalDate getBirthday() {
    return birthday;
  }
}
