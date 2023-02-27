package views;

import java.util.Scanner;
import models.School;

public class SchoolManagement extends Menu<String> {
    static String[] menu = { "List all student", "Sreach student", "Add new student", "Sorting display" };
    private School sch = new School();

    public SchoolManagement() {
        super("School Management!", menu);
    }

    @Override
    public void excute(int n) {
        Scanner sc = new Scanner(System.in);
        switch (n) {
            case 1:
                sch.showStudentList();
                System.out.println("Press enter to continue");
                sc.nextLine();
                break;
            case 2:
                sreachType();
                break;
            case 3:
                sch.add();
                System.out.println("Press enter to continue");
                sc.nextLine();
                break;
            case 4:

        }
    }

    private void sreachType() {
        String[] menuSreach = { "Search by ID", "Search by name", "Search by average" };
        Menu m = new Menu("Student searching", menuSreach) {
            public void excute(int n) {
                switch (n) {
                    case 1:
                        sch.sreachByID();
                        break;
                    case 2:
                        sch.sreachByName();
                        break;
                    case 3:
                        sch.sreachByAverage();
                        break;
                    default:
                        return;
                }
            }
        };
        m.run();
    }
}
