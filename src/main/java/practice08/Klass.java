package practice08;

import java.util.*;

public class Klass {
    private int number;
    private List<Student> members = new ArrayList<Student>();
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        if (members.contains(student)) {
            leader = student;
        }
        else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        members.add(student);
    }
}
