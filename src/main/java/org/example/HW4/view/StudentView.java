package org.example.HW4.view;

import org.example.HW4.model.Student;
import org.example.HW4.model.User;

public class StudentView extends UserView {
    public void printOnConsole(User user) {
        System.out.println(((Student) user).toString());
    }
}
