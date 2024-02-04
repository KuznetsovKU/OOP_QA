package org.example.HW4.model;

import java.time.LocalDate;

public class Teacher extends User{
    private static long tIDGenerator;

    static {
        tIDGenerator = 0;
    }

    private long teacherID;
    private String mainSubject;
    private String additionalSubject;

    public Teacher(String lastName, String firstName, String secondName, LocalDate birthDate, int sex) {
        super(lastName, firstName, secondName, birthDate, sex);
        this.mainSubject = null;
        this.additionalSubject = null;
        this.teacherID = tIDGenerator++;
    }

    public long getTeacherID() {
        return teacherID;
    }

    public String getMainSubject() {
        return mainSubject;
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    public String getAdditionalSubject() {
        return additionalSubject;
    }

    public void setAdditionalSubject(String additionalSubject) {
        this.additionalSubject = additionalSubject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                super.toString() +
                ", mainSubject='" + mainSubject + '\'' +
                ", additionalSubject='" + additionalSubject + '\'' +
                '}';
    }
}
