package com.twu.biblioteca.model;

import com.twu.biblioteca.model.IItem;

public class Movie implements IItem {
    private String name;
    private int year;
    private String director;
    private int rating;

    public Movie(String name, int year, String director) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = 0;
    }

    public Movie(String name, int year, String director, int rating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }


    public String getTitle() {
        return null;
    }

    public String getAuthor() {
        return null;
    }

    public int getYear() {
        return year;
    }

    public boolean isBookAvailable() {
        return false;
    }

    public void setAvailable(boolean available) {

    }


    public String getDirector() {
        return director;
    }


    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
