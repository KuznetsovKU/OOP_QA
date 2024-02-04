package org.example.HW4.model;

import java.time.LocalDate;
import java.time.Period;

public abstract class User {
    private static long idGenerator;

    static {
        idGenerator = 0;
    }

    private long userID;
    private String lastName;
    private String firstName;
    private String secondName;
    private LocalDate birthDate;
    private int age;
    private int sex;  // 1 - male, 0 - female

    public User(String lastName, String firstName, String secondName, LocalDate birthDate, int sex) {
        this.userID = idGenerator++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.age = setAgeByBirthDate(birthDate);
        this.sex = sex;
    }

    private int setAgeByBirthDate(LocalDate birthDate) {
        Period diff = Period.between(LocalDate.now(), birthDate);
        return diff.getYears();
    }

    public long getUserID() {
        return userID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        setAgeByBirthDate(birthDate);
    }

    public int getAge() {
        return age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthDate=" + birthDate +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

}
