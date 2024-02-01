package org.example.HW3.Teacher;

import org.example.HW3.UserController;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String lastName, String middleName, int age, int sex) {
        teacherService.createTeacher(firstName, lastName, middleName, age, sex);
    }

    public void showTeachers() {
        teacherView.sendOnConsole(teacherService.getTeacherList());
    }

    public void updateTeacher(Teacher teacher, String firstName, String lastName, String middleName, int age, int sex) {
        teacher.setFirstName(firstName);
        teacher.setLastName(lastName);
        teacher.setMiddleName(middleName);
        teacher.setAge(age);
        teacher.setSex(sex);
    }
}
