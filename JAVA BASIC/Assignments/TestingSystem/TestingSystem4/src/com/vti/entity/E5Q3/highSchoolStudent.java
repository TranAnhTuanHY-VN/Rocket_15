package com.vti.entity.E5Q3;

public class highSchoolStudent extends Student {
    private String className;
    private String desiredUniversity;

    public highSchoolStudent(int ID, String name, String className, String desiredUniversity) {
        super(ID, name);
        this.className = className;
        this.desiredUniversity = desiredUniversity;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDesiredUniversity() {
        return desiredUniversity;
    }

    public void setDesiredUniversity(String desiredUniversity) {
        this.desiredUniversity = desiredUniversity;
    }

    @Override
    public String toString() {
        return "highSchoolStudent{" +
                "ID: " + super.getID() +
                ",Name: '" + super.getName() +'\''+
                ",className='" + className + '\'' +
                ", desiredUniversity='" + desiredUniversity + '\'' +
                '}';
    }
}
