module BookStore.REST.API {
  requires BookStore.Core;

  requires spring.beans;
  requires spring.context;
  requires spring.web;
  requires spring.boot.autoconfigure;
  requires spring.boot;
  requires java.base;
  requires java.sql;
  requires spring.core;

  exports com.bookstore.api;
  opens com.bookstore.api to spring.core;
  opens com.bookstore.api.controller to spring.beans, spring.web;
}