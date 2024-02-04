package org.example.HW4.controller;

import org.example.HW4.model.*;
import org.example.HW4.service.DataService;
import org.example.HW4.service.StudyGroupService;
import org.example.HW4.view.StudentView;

import java.time.LocalDate;
import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudyGroupService studyGroupService = new StudyGroupService();

    public void createStudent(String lastName, String firstName, String secondName, LocalDate birthDate, int sex) {
        dataService.createPerson(lastName, firstName, secondName, birthDate, sex, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> users = dataService.getAllUsersByType(Type.STUDENT);
        for (User user: users) {
            studentView.printOnConsole((Student) user);
        }
    }

    public void getAllTeacher() {
        List<User> users = dataService.getAllUsersByType(Type.TEACHER);
        // todo
    }

    public void getAllUsers() {
        List<User> users = dataService.getAllUsers();
        // todo
    }

    public StudyGroup createStudentGroup(Teacher teacher, List<Student> studentList) {
        return studyGroupService.createStudyGroup(teacher, studentList);
    }

}
