package org.example.HW4.view;

import org.example.HW4.model.Teacher;
import org.example.HW4.model.User;

public class TeacherView extends UserView {
    @Override
    public void printOnConsole(User user) {
        System.out.println(((Teacher) user).toString());
    }
}
