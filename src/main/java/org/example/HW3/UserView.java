package org.example.HW3;

import java.util.List;

public interface UserView<T extends User>{
     void sendOnConsole (List<T> list);
}
