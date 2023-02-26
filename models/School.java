package models;

import java.util.ArrayList;
import java.util.Scanner;

public class School extends ArrayList<Student> {

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

    public void add() {
        Scanner sc = new Scanner(System.in);
        String nStudentID;
        String nName;
        float nAverage;
        boolean idDup = false;

        do{
            System.out.println("Enter student ID: ");
            nStudentID = sc.nextLine();
            nStudentID = nStudentID.trim().toUpperCase();
            idDup = checkIdDup(nStudentID);
            if(idDup){
                System.out.println("Student with this ID already exists.");
        }while(idDup);

        System.out.println("Enter name: ");
        nName = sc.nextLine();
        nName = convertRightFormat(nName);

        do{
            System.out.println("Enter Average: ");
            try{
                nAverage = sc.nextFloat();
                sc.nextLine();
                break;
            } catch (Exception e){
                System.out.println("Wrong input!");
            }
        }while(true);

        Student nSudent = new Student(nStudentID, nName, nAverage);

        this.add(nSudent);

        System.out.println("Studen with " + nStudentID + " added!");
    }

}
