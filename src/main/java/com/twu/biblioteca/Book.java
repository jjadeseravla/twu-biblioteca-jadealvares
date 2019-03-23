package com.twu.biblioteca;

public class Book implements Item{
    private String title;
    private String Author;
    private int Year;
    private boolean available = true;

    public Book(String title, String Author, int Year) {
        this.title = title;
        this.Author = Author;
        this.Year = Year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getYear() {
        return Year;
    }


    public boolean isBookAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getName() {
        return null;
    }

    public String getDirector() {
        return null;
    }

    public int getRating() {
        return 0;
    }
}
