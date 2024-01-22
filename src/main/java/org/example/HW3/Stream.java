package org.example.HW3;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup>, Comparable<Stream> {
    private static int streamNumSetter;
    private int streamNum;
    private List<StudyGroup> studyGroupList;

    static {
        streamNumSetter = 0;
    }

    public Stream(List<StudyGroup> studyGroupList) {
        this.streamNum = streamNumSetter++;
        this.studyGroupList = studyGroupList;
    }

    public int getStreamNum() {
        return streamNum;
    }

    public void setStreamNum(int streamNum) {
        this.streamNum = streamNum;
    }

    public List<StudyGroup> getStudyGroupList() {
        return studyGroupList;
    }

    public void setStudyGroupList(List<StudyGroup> studyGroupList) {
        this.studyGroupList = studyGroupList;
    }

    public void addGroupToStream(StudyGroup studyGroup) {
        this.studyGroupList.add(studyGroup);
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return new StreamIterator(this);
    }

    @Override
    public int compareTo(Stream stream) {
        return Integer.compare(this.getStreamNum(), stream.getStreamNum());
    }
}
