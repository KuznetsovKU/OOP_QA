package org.example.HW3;

public class Student implements Comparable<Student>{
    private static int IDGen;
    private int studentID;
    private String firstName;
    private String lastName;
    private String middleName;
    private int age;
    private int sex;

    static {
        Student.IDGen = 1;

    }

    public Student(String firstName, String lastName, String middleName, int age, int sex) {
        this.studentID = IDGen++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.sex = sex;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.getStudentID(), student.getStudentID());
    }
}
