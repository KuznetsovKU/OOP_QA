package org.example.HW3.Teacher;

import java.util.List;

public class TeacherService {
    private List<Teacher> teacherList;

    public void createTeacher(String firstName, String lastName, String middleName, int age, int sex) {
        this.teacherList.add(new Teacher(firstName, lastName, middleName, age, sex));
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }
}
