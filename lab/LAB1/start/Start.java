package start;
import java.util.*;
import java.util.ArrayList;

import operation1.StudentOperation1;
public class Start {
    public static void main(String []agsh){
        ArrayList< StudentOperation1> students = new ArrayList<>();
        students.add(new StudentOperation1("Argho Kumar Datta ", "24-57530-2", 3.83, 6));

        for( StudentOperation1 obj : students){
            obj.allShow();
        }
    }

    
}
