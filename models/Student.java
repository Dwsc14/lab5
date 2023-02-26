package models;

import java.util.ArrayList;

public class Student extends ArrayList<Student> {

    String ID, name;
    float Average;

    public Student() {
    }

    public Student(String iD, String name, float average) {
        ID = iD;
        this.name = name;
        Average = average;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverage() {
        return Average;
    }

    public void setAverage(float average) {
        Average = average;
    }

}
