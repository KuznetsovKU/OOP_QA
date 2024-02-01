package org.example.HW3.Student;

import org.example.HW3.*;
import org.example.HW3.Groups.Stream;
import org.example.HW3.Groups.StreamService;
import org.example.HW3.Groups.StudyGroup;
import org.example.HW3.Groups.StudyGroupService;

import java.util.List;

public class StudentController implements UserController<Student> {

    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final StreamService streamService = new StreamService();
    private final StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String lastName, String middleName, int age, int sex) {
        studyGroupService.createStudent(firstName, lastName, middleName, age, sex);
    }

    public void removeStudentByFIO (String firstName, String lastName, String middleName) {
        studyGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> sortStudentByStudentID (StudyGroup studyGroup) {
        List<Student> studentList = studyGroupService.sortStudentByStudentID(studyGroup);
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Student> sortStudentsByFIO (StudyGroup studyGroup) {
        List<Student> studentList = studyGroupService.sortStudentsByFIO(studyGroup);
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Stream> sortStreamsBySize() {
        return streamService.sortStreamsBySize();
    }
}

