package org.example.HW3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream stream1, Stream stream2) {
        int size1 = stream1.getStudyGroupList().size();
        int size2 = stream2.getStudyGroupList().size();
        if (size1 > size2) {
            return 1;
        } else if (size1 < size2) {
            return -1;
        }
        return 0;
    }
}
