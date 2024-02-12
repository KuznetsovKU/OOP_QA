package org.example.HW4.service;

import org.example.HW4.model.Student;
import org.example.HW4.model.Teacher;
import org.example.HW4.model.Type;
import org.example.HW4.model.User;

import java.time.LocalDate;
import java.util.List;

public class PersonCreator {

    public void createPerson(List<User> userList, String lastName, String firstName, String secondName, LocalDate birthDate, int sex, Type type) {
        if (Type.STUDENT == type) {
            userList.add(new Student(lastName, firstName, secondName, birthDate, sex));
        } else if (Type.TEACHER == type) {
            userList.add(new Teacher(lastName, firstName, secondName, birthDate, sex));
        }
    }
}
