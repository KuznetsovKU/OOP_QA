package org.example.HW4.service;

import org.example.HW4.model.Student;
import org.example.HW4.model.Teacher;
import org.example.HW4.model.Type;
import org.example.HW4.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList;

    public void createPerson(String lastName, String firstName, String secondName, LocalDate birthDate, int sex, Type type) {
        if (Type.STUDENT == type) {
            userList.add(new Student(lastName, firstName, secondName, birthDate, sex));
        } else if (Type.TEACHER == type) {
            userList.add(new Teacher(lastName, firstName, secondName, birthDate, sex));
        }
    }

    public User getUserByID (long userID) {
        for (User user: userList) {
            if (user.getUserID() == userID) {
                return user;
            }
        }
        return null;
    }

    public User getUserByID(Type type, long userIDByType) {
        User currentUser = null;
        for (User user: userList) {
            if (Type.STUDENT == type && ((Student)user).getStudentID() == userIDByType) {
                currentUser = user;
            } else if (Type.TEACHER == type && ((Teacher)user).getTeacherID() == userIDByType) {
                currentUser = user;
            }
        }
        return currentUser;
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public List<User> getAllUsersByType(Type type) {
        List<User> users = new ArrayList<>();
        for (User user: userList) {
            if (Type.TEACHER == type && user instanceof Student) {
                users.add(user);
            } else if (Type.TEACHER == type && user instanceof Teacher) {
                users.add(user);
            }
        }
        return users;
    }

}
