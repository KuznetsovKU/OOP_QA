package org.example.HW3;

import java.util.List;

public class Controller {
    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final StreamService streamService = new StreamService();

    public void removeStudentByFIO (String firstName, String lastName, String middleName) {
        studyGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> sortStudentByStudentID (StudyGroup studyGroup) {
        return studyGroupService.sortStudentByStudentID(studyGroup);
    }

    public List<Student> sortStudentsByFIO (StudyGroup studyGroup) {
        return studyGroupService.sortStudentsByFIO(studyGroup);
    }

    public List<Stream> sortStreamsBySize() {
        return streamService.sortStreamsBySize();
    }
}

