package com.itheima.BooksManagementSystem;

public class Book {
    private String number;
    private String name;
    private String author;
    private int price;

    public Book() {
    }

    public Book(String number, String name, String author, int price) {
        this.number = number;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String bookName) {
        this.name = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
