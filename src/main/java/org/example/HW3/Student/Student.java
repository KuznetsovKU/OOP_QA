package org.example.HW3.Student;

import org.example.HW3.User;

public class Student extends User implements Comparable<Student>{
    private static int IDGen;
    private int studentID;

    static {
        Student.IDGen = 1;

    }

    public Student(String firstName, String lastName, String middleName, int age, int sex) {
        super(firstName, lastName, middleName, age, sex);
        this.studentID = IDGen++;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.getStudentID(), student.getStudentID());
    }
}
