package org.example.HW4.view;

import org.example.HW4.model.User;

public class UserView implements MainView{
    @Override
    public void printOnConsole(User user) {
        System.out.println(user.toString());
    }
}
