package com.vti.entity.E5Q4;

import java.time.LocalDate;

public class Article extends Document {
    private LocalDate dayRelease;

    public Article(String ID, String publisher, int numRelease, LocalDate dayRelease) {
        super(ID, publisher, numRelease);
        this.dayRelease = dayRelease;
    }

    @Override
    public String toString() {
        return "Article{" +
                "dayRelease=" + dayRelease +
                '}';
    }
}
