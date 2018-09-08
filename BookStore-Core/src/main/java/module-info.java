module BookStore.Core {
  requires java.validation;
  requires spring.context;

  exports com.bookstore.services;
  exports com.bookstore.model;
}