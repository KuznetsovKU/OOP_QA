package org.example.HW4.service;

import org.example.HW4.model.Type;
import org.example.HW4.model.User;

import java.time.LocalDate;
import java.util.List;

public class DataService {
    private List<User> userList;

    private final PersonCreator personCreator = new PersonCreator();

    // метод вынесен в отдельный класс PersonCreator ("единственная ответственность")
    public void createPerson(String lastName, String firstName, String secondName, LocalDate birthDate, int sex, Type type) {
        personCreator.createPerson(userList, lastName, firstName, secondName, birthDate, sex, type);
    }

    // метод вынесен в отдельный класс SingleUserFinder ("единственная ответственность")
    public User getUserByID (long userID) {
        return new SingleUserFinder().getUserByID(userList, Type.ALL, userID);
    }

    // метод вынесен в отдельный класс SingleUserFinder ("единственная ответственность")
    public User getUserByID(Type type, long userIDByType) {
        return new SingleUserFinder().getUserByID(userList, type, userIDByType);
    }

    // метод вынесен в отдельный класс GroupUserFinder ("единственная ответственность")
    public List<User> getAllUsers() {
        return new GroupUserFinder().getAllUsers(userList, Type.ALL);
    }

    // метод вынесен в отдельный класс GroupUserFinder ("единственная ответственность")
    public List<User> getAllUsersByType(Type type) {
        return new GroupUserFinder().getAllUsers(userList, type);
    }

}
