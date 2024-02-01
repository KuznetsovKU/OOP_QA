package org.example.HW3.Groups;

import java.util.List;

public class StreamService {
    private List<Stream> streamList;

    public List<Stream> sortStreamsBySize() {
        streamList.sort(new StreamComparator());
        return streamList;
    }
}
