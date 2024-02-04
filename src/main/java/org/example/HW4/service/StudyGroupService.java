package org.example.HW4.service;

import org.example.HW4.model.Student;
import org.example.HW4.model.StudyGroup;
import org.example.HW4.model.Teacher;

import java.util.List;

public class StudyGroupService {

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> studentList) {
        return new StudyGroup(teacher, studentList);
    }
}
