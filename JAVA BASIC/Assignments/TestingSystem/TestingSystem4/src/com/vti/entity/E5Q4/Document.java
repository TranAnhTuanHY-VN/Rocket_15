package com.vti.entity.E5Q4;

public abstract class Document {
    private String ID;
    private String publisher;
    private int numRelease;

    public Document(String ID, String publisher, int numRelease) {
        this.ID = ID;
        this.publisher = publisher;
        this.numRelease = numRelease;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumRelease() {
        return numRelease;
    }

    public void setNumRelease(int numRelease) {
        this.numRelease = numRelease;
    }

    @Override
    public String toString() {
        return "Document{" +
                "ID='" + ID + '\'' +
                ", publisher='" + publisher + '\'' +
                ", numRelease=" + numRelease +
                '}';
    }
}
