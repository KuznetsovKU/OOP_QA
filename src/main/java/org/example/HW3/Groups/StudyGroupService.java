package org.example.HW3.Groups;

import org.example.HW3.Student.Student;
import org.example.HW3.UserComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudyGroupService {
    private StudyGroup studyGroup;
    public void removeStudentByFIO (String firstName, String lastName, String middleName) {
        Iterator<Student> iterator = studyGroup.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFirstName().equalsIgnoreCase(firstName)
                    && student.getLastName().equalsIgnoreCase(lastName)
                    && student.getMiddleName().equalsIgnoreCase(middleName)) {
                iterator.remove();
            }
        }
    }

    public List<Student> sortStudentByStudentID (StudyGroup studyGroup) {
        List<Student> studentList = new ArrayList<>(studyGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student> sortStudentsByFIO (StudyGroup studyGroup) {
        List<Student> studentList = new ArrayList<>(studyGroup.getStudentList());
        studentList.sort(new UserComparator<Student>());
        return studentList;
    }

    public void createStudent(String firstName, String lastName, String middleName, int age, int sex) {
        studyGroup.createStudent(firstName, lastName, middleName, age, sex);
    }
}
