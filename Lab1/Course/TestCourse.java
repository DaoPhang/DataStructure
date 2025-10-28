package DS.Lab1.Course;

import java.util.Scanner;

public class TestCourse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter course name: ");
        String courseName = sc.nextLine();
        TheCourse course = new TheCourse(courseName);

        int choice;
        do {
            // Display menu
            System.out.println("\n===== Course Management Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Drop Student");
            System.out.println("3. View Students");
            System.out.println("4. Clear All Students");
            System.out.println("5. View Number of Students");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name to add: ");
                    String studentToAdd = sc.nextLine();
                    course.addStudent(studentToAdd);
                    System.out.println(studentToAdd + " has been added.");
                    break;

                case 2:
                    System.out.print("Enter student name to drop: ");
                    String studentToDrop = sc.nextLine();
                    course.dropStudent(studentToDrop);
                    break;

                case 3:
                    System.out.println("\nStudents currently enrolled in " + course.getCourseName() + ":");
                    String[] students = course.getStudents();
                    if (students.length == 0) {
                        System.out.println("No students enrolled.");
                    } else {
                        for (int i = 0; i < students.length; i++) {
                            System.out.println((i + 1) + ". " + students[i]);
                        }
                    }
                    break;

                case 4:
                    course.clear();
                    System.out.println("All students have been cleared.");
                    break;

                case 5:
                    System.out.println("Number of students: " + course.getNumberOfStudents());
                    break;

                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
