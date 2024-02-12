package org.example.HW4.service;

import org.example.HW4.model.Student;
import org.example.HW4.model.Teacher;
import org.example.HW4.model.Type;
import org.example.HW4.model.User;

import java.util.List;

public class SingleUserFinder {

    public User getUserByID(List<User> userList, Type type, long userID) {
        if (Type.ALL == type) {
            for (User user: userList) {
                if (user.getUserID() == userID) {
                    return user;
                }
            }
        }
        User currentUser = null;
        for (User user: userList) {
            if (Type.STUDENT == type && ((Student)user).getStudentID() == userID) {
                currentUser = user;
            } else if (Type.TEACHER == type && ((Teacher)user).getTeacherID() == userID) {
                currentUser = user;
            }
        }
        return currentUser;
    }
}
