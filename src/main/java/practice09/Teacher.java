package practice09;

import java.util.*;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private List<Klass> klasses;


    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, List<Klass> klasses) {
        super(id, name, age);
        this.klasses = klasses;
    }

    public List<Klass> getKlass() {
        return klasses;
    }
//TODO
    @Override
    public String introduce() {
        String strClass = "";
        if (klasses == null) {
            strClass = "No Class";
        }
        else {
            strClass = "Class ";
            strClass += klasses.stream().map(Klass::getNumber).map(String::valueOf).collect(Collectors.joining(", "));
        }
        return super.introduce() + " I am a Teacher. I teach " + strClass + ".";
    }
//TOCHECK
    public String introduceWith(Student student) {
        StringBuilder intro = new StringBuilder(super.introduce());
        intro.append(" I am a Teacher. ");
        if (isTeaching(student)) {
            intro.append("I teach ").append(student.getName()).append(".");
        } else {
            intro.append("I don't teach ").append(student.getName()).append(".");
        }

        return intro.toString();
    }

    public boolean isTeaching(Student student) {
        return klasses.stream().anyMatch(i -> i.getNumber() == student.getKlass().getNumber());
    }

    public List<Klass> getClasses() {
        return klasses;
    }
}

