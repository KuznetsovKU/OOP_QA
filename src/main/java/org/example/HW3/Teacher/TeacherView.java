package org.example.HW3.Teacher;

import org.example.HW3.UserView;

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher.getTeacherID());
        }
    }
}
