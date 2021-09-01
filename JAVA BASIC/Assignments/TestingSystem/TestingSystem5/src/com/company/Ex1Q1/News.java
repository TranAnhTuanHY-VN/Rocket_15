package com.company.Ex1Q1;

public class News implements INews {
    private int ID;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private int[] rate;
    private float averageRate;
    private static int COUNT = 0;

    public News(String title, String publishDate, String author, String content, int[] rate) {
        COUNT ++;
        this.ID = COUNT;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
        this.rate = rate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int[] getRate() {
        return rate;
    }

    public void setRate(int[] rate) {
        this.rate = rate;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void Display() {
        System.out.println("[Title: " + title + ", publishDate: " + publishDate + 
                ", Author: " + author + ", Content: " + content + ", AverageRate: " + averageRate+ "]");
    }

    @Override
    public float Caculate() {
        averageRate = (float) ((rate[0]+rate[1]+rate[2])/3);
        return averageRate;
    }
}
