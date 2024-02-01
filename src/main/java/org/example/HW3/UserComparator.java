package org.example.HW3;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T ob1, T ob2) {
        int resultOfComparing = ob1.getFirstName().compareToIgnoreCase(ob2.getFirstName());
        if (resultOfComparing == 0) {
            resultOfComparing = ob1.getLastName().compareToIgnoreCase(ob2.getLastName());
            if (resultOfComparing == 0) {
                return ob1.getMiddleName().compareToIgnoreCase(ob2.getMiddleName());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
