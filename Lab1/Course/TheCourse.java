package DS.Lab1.Course;

public class TheCourse {
    private String courseName;
    private String[] students;
    private int numberOfStudents;
    
    public TheCourse(String courseName) {
        this.courseName = courseName;
        this.students = new String[10];
        this.numberOfStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
    // Resize the array if it's full
    if (numberOfStudents >= students.length) {
    String[] newStudents = new String[students.length * 2];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        students = newStudents;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        boolean found = false;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                found = true;
                // Shift remaining students
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                break;
            }
        }
        if (!found) {
            System.out.println("Student " + student + " not found in the course.");
        }
    }

    public String[] getStudents() {
        String[] currentStudents = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            currentStudents[i] = students[i];
        }
        return currentStudents;
    }

    // Accessor for number of students
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void clear() {
        students = new String[10]; // reset to initial capacity
        numberOfStudents = 0;
    }
}