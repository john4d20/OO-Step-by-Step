package practice02;

public class Student {
    private String name;
    private int age;
    private int classNumber;
    public Student(String name, int age, int classNumber) {
        this.name = name;
        this.age = age;
        this.classNumber = classNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return String.format("I am a Student. I am at Class %d.",classNumber);
    }

    public int getKlass() {
        return classNumber;
    }
}
