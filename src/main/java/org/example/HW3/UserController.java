package org.example.HW3;

public interface UserController<T extends User> {
    void create(String firstName, String lastName, String middleName, int age, int sex);

}
