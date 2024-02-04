package org.example.HW4.model;

import java.time.LocalDate;

public class Student extends User{
    private static long sIDGenerator;

    static {
        sIDGenerator = 0;
    }

    private long studentID;

    public Student(String lastName, String firstName, String secondName, LocalDate birthDate, int sex) {
        super(lastName, firstName, secondName, birthDate, sex);
        this.studentID = sIDGenerator++;
    }

    public long getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                super.toString() +
                '}';
    }

}
