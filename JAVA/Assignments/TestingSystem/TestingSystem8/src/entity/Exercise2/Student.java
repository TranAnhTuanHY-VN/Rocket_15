package entity.Exercise2;

import java.time.LocalDate;

public class Student implements Comparable<Student>{
    private int ID;
    private String name;
    private LocalDate birthDay;
    private float score;
    public static int COUNT;

    public Student(String name, LocalDate birthDay, float score) {
        COUNT++;
        this.ID = COUNT;
        this.name = name;
        this.birthDay = birthDay;
        this.score = score;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", score=" + score +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        int flagCompare = this.name.compareTo(o.getName());
        if (flagCompare == 0) {
            if (this.score > o.score) {
                return 1;
            } else if (this.score < o.score) {
                return -1;
            } else if (this.score == o.score) {
                return this.birthDay.compareTo(o.getBirthDay());
            }
        }else {
            return flagCompare;
        }
        return 0;
    }


}
