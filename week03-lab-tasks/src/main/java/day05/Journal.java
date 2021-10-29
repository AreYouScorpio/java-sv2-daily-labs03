package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    String name;



    public String getName() {
        return name;
    }

    public void setName(String name2) {
        this.name = name;
    }


    private List<String> students = new ArrayList<>();

    @Override
    public String toString() {
        return "Journal{" +
                "students=" + students +
                '}';
    }

    public boolean addStudent(String studentName) {
        if (studentName.trim().indexOf(" ") > 0) {
            students.add(studentName);
            return true;
        }
        return false;


    }

    public List<String> getStudents() {
        return students;
    }
}