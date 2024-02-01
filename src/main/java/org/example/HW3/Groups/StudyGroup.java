package org.example.HW3.Groups;

import org.example.HW3.Student.Student;

import java.util.Iterator;
import java.util.List;

public class StudyGroup  implements Iterable<Student> {
    private int groupNum;
    private List<Student> studentList;

    public StudyGroup(int groupNum, List<Student> studentList) {
        this.groupNum = groupNum;
        this.studentList = studentList;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudentToGroup (Student student) {
        this.studentList.add(student);
    }

    public void createStudent(String firstName, String lastName, String middleName, int age, int sex) {
        this.studentList.add(new Student(firstName, lastName, middleName, age, sex));
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudyGroupIterator(this);
    }
}
