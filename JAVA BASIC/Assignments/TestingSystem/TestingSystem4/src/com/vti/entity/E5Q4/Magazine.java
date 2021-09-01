package com.vti.entity.E5Q4;

import java.time.LocalDate;

public class Magazine extends Document {
    private int idRelease;
    private LocalDate monthRelease;

    public Magazine(String ID, String publisher, int numRelease, int idRelease, LocalDate monthRelease) {
        super(ID, publisher, numRelease);
        this.idRelease = idRelease;
        this.monthRelease = monthRelease;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "idRelease=" + idRelease +
                ", monthRelease=" + monthRelease +
                '}';
    }
}
