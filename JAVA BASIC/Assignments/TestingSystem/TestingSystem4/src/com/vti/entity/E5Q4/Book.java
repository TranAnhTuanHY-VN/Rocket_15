package com.vti.entity.E5Q4;

public class Book extends Document {
    private String authorName;
    private int numPage;

    public Book(String ID, String publisher, int numRelease, String authorName, int numPage) {
        super(ID, publisher, numRelease);
        this.authorName = authorName;
        this.numPage = numPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", numPage=" + numPage +
                '}';
    }
}
