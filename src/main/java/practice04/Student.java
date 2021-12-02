package practice04;

public class Student extends Person{
    private int klass;
//TODO delete
    public Student(String name, int age) {

        super(name, age);
    }

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        return super.introduce() + String.format(" I am a Student. I am at Class %d.",klass);
    }
}
