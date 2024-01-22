package org.example.HW3;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudyGroup> {

    private int counter;
    private List<StudyGroup> studyGroupList;

    public StreamIterator(Stream stream) {
        this.counter = 0;
        this.studyGroupList = stream.getStudyGroupList();
    }

    @Override
    public boolean hasNext() {
        return counter < studyGroupList.size() - 1;
    }

    @Override
    public StudyGroup next() {
        if (!hasNext()) {
            return null;
        }
        counter++;
        return studyGroupList.get(counter);
    }

    @Override
    public void remove() {
        studyGroupList.remove(counter);
    }
}
