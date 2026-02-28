import java.util.Arrays;

public class Main {

    static class Person {
        String firstName, lastName, gender;

        Person(String f, String l, String g) {
            firstName = f;
            lastName = l;
            gender = g;
        }

        public String toString() {
            return firstName + " " + lastName + " (" + gender + ")";
        }
    }

    static class Teacher extends Person {
        String department;
        String[] courses;

        Teacher(String f, String l, String g, String d, String[] c) {
            super(f, l, g);
            department = d;
            courses = c;
        }

        public String toString() {
            return super.toString() +
                    ", Department: " + department +
                    ", Courses: " + Arrays.toString(courses);
        }
    }

    static class Student extends Person {
        String studentId;

        Student(String f, String l, String g, String id) {
            super(f, l, g);
            studentId = id;
        }

        public String toString() {
            return super.toString() +
                    ", Student ID: " + studentId;
        }
    }

    static class PhdStudent extends Student {
        String department;

        PhdStudent(String f, String l, String g, String id, String d) {
            super(f, l, g, id);
            department = d;
        }

        public String toString() {
            return super.toString() +
                    ", Research Department: " + department;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Person("Ali", "Mammadov", "Male"));
        System.out.println(new Teacher("Leyla", "Huseynova", "Female",
                "Computer Science", new String[]{"OOP", "Java"}));
        System.out.println(new Student("Murad", "Karimov", "Male", "S101"));
        System.out.println(new PhdStudent("Nigar", "Qasimli", "Female",
                "P9001", "Artificial Intelligence"));
    }
}