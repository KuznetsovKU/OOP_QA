package org.example.HW3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        int resultOfComparing = student1.getFirstName().compareToIgnoreCase(student2.getFirstName());
        if (resultOfComparing == 0) {
            resultOfComparing = student1.getLastName().compareToIgnoreCase(student2.getLastName());
            if (resultOfComparing == 0) {
                return student1.getMiddleName().compareToIgnoreCase(student2.getMiddleName());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
