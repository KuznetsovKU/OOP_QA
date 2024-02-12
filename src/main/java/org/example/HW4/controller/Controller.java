package org.example.HW4.controller;

import org.example.HW4.model.*;
import org.example.HW4.service.DataService;
import org.example.HW4.service.StudyGroupService;
import org.example.HW4.view.StudentView;
import org.example.HW4.view.TeacherView;
import org.example.HW4.view.UserView;

import java.time.LocalDate;
import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final UserView userView = new UserView();
    private final StudyGroupService studyGroupService = new StudyGroupService();

    public void createStudent(String lastName, String firstName, String secondName, LocalDate birthDate, int sex) {
        dataService.createPerson(lastName, firstName, secondName, birthDate, sex, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> users = dataService.getAllUsersByType(Type.STUDENT);
        for (User user: users) {
            studentView.printOnConsole(user);
        }
    }

    public void getAllTeacher() {
        List<User> users = dataService.getAllUsersByType(Type.TEACHER);
        for (User user: users) {
            teacherView.printOnConsole(user);
        }
    }

    public void getAllUsers() {
        List<User> users = dataService.getAllUsers();
        for (User user: users) {
            userView.printOnConsole(user);
        }
    }

    public StudyGroup createStudentGroup(Teacher teacher, List<Student> studentList) {
        return studyGroupService.createStudyGroup(teacher, studentList);
    }

}
