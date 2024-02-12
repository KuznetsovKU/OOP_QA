package org.example.HW4.service;

import org.example.HW4.model.Student;
import org.example.HW4.model.Teacher;
import org.example.HW4.model.Type;
import org.example.HW4.model.User;

import java.util.ArrayList;
import java.util.List;

public class GroupUserFinder {

    public List<User> getAllUsers(List<User> userList, Type type) {
        if (Type.ALL == type) {
            return userList;
        }
        List<User> users = new ArrayList<>();
        for (User user: userList) {
            if (Type.STUDENT == type && user instanceof Student) {
                users.add(user);
            } else if (Type.TEACHER == type && user instanceof Teacher) {
                users.add(user);
            }
        }
        return users;
    }

}
