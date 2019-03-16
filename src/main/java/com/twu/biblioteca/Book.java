package com.twu.biblioteca;

public class Book {
    private String title;
    private String Author;
    private int Year;

    public Book(String title, String Author, int Year) {
        this.title = title;
        this.Author = Author;
        this.Year = Year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }
}
