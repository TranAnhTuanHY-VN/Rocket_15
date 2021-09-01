package com.vti.entity;

public class Student {
    //Exercise 4: Encapsulation
    //a:
    private int ID;
    private String name;
    private String homeTown;
    private float score;

    //b
    public Student(String name, String homeTown) {
        this.name = name;
        this.homeTown = homeTown;
        this.score = 0;
    }
    //c
    public void setScore(float score) {
        this.score = score;
    }
    //d
    public void plusScore(float score) {
        this.score = this.score + score;
    }
    //e

    @Override
    public String toString() {
        String rank;
        if (score < 4) {
            rank = "Yếu";
        } else if (score<6) {
            rank = "Trung Bình";
        } else if (score<8) {
            rank = "Khá";
        } else{
            rank = "Giỏi";
        }
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", rankLearning="+rank+
                '}';
    }
}
