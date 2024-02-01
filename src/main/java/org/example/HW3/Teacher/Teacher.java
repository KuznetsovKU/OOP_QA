package org.example.HW3.Teacher;

import org.example.HW3.User;

public class Teacher extends User implements Comparable<Teacher>{
    private static int IDGen;
    private int teacherID;

    static {
        Teacher.IDGen = 1;

    }

    public Teacher(String firstName, String lastName, String middleName, int age, int sex) {
        super(firstName, lastName, middleName, age, sex);
        this.teacherID = IDGen++;
    }

    public int getTeacherID() {
        return teacherID;
    }

    @Override
    public int compareTo(Teacher teacher) {
        return Integer.compare(this.getTeacherID(), teacher.getTeacherID());
    }
}
