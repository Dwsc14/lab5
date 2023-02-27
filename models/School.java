package models;

import java.util.ArrayList;
import java.util.Scanner;

public class School extends ArrayList<Student> {

    static Scanner sc = new Scanner(System.in);

    public Student searchToFindIdDup(String nStudentID) {
        nStudentID = nStudentID.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getID().equals(nStudentID)) {
                return this.get(i);
            }
        }
        return null;
    }

    public boolean checkIdDup(String nStudentID) {
        return searchToFindIdDup(nStudentID) != null;
    }

    public String convertRightFormat(String nName) {
        nName = nName.trim();
        nName = nName.replaceAll("\\s+", " ");
        return nName;
    }

    public void sreachByID() {
        System.out.println("Enter ID: ");
        String StudentID = sc.nextLine();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getID().equals(StudentID)) {
                this.get(i).toString();
            }
        }
        System.out.println("No students found");
    }

    public void sreachByName() {
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getName().equals(name)) {
                this.get(i).toString();
            }
        }
        System.out.println("No students found");
    }

    public void sreachByAverage() {
        System.out.println("Enter average: ");
        float average = sc.nextFloat();
        sc.nextLine();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getAverage() == average) {
                this.get(i).toString();
            }
        }
        System.out.println("No students found");
    }

    public void add() {
        String nStudentID;
        String nName;
        float nAverage;
        boolean idDup = false;

        do {
            System.out.println("Enter student ID: ");
            nStudentID = sc.nextLine();
            nStudentID = nStudentID.trim().toUpperCase();
            idDup = checkIdDup(nStudentID);
            if (idDup) {
                System.out.println("Student with this ID already exists.");
            }
        } while (idDup);

        System.out.println("Enter name: ");
        nName = sc.nextLine();
        nName = convertRightFormat(nName);

        do {
            System.out.println("Enter Average: ");
            try {
                nAverage = sc.nextFloat();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Wrong input!");
            }
        } while (true);

        Student nSudent = new Student(nStudentID, nName, nAverage);

        this.add(nSudent);

        System.out.println("Studen with " + nStudentID + " added!");
    }

    public void showStudentList() {
        for (Student std : this) {
            System.out.println(std.toString());
        }
    }

}
