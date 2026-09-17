/** Q1: Student Record — Class and Object */
public class StudentMain {
    static class Student {
        String name;
        int rollNo;
        double marks;

        Student() {
            name = "Aman";
            rollNo = 101;
            marks = 85.5;
        }

        void displayDetails() {
            System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks);
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.displayDetails();
    }
}
