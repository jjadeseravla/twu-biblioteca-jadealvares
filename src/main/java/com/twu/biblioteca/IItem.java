package com.twu.biblioteca;

public interface IItem {
    String getTitle();

    String getAuthor();

    int getYear();

    boolean isBookAvailable();

    void setAvailable(boolean available);

    String getName();

    String getDirector();

    int getRating();
}
