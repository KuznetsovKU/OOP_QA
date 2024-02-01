package org.example.HW3.Groups;

import org.example.HW3.Student.Student;

import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<Student> {

    private int counter;
    private final List<Student> studentList;

    public StudyGroupIterator(StudyGroup studyGroup) {
        this.counter = 0;
        this.studentList = studyGroup.getStudentList();
    }



    @Override
    public boolean hasNext() {
        return counter < studentList.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        counter++;
        return studentList.get(counter);
    }

    @Override
    public void remove() {
        studentList.remove(counter);
    }
}
