package practice06;

public class Teacher extends Person{

    private Integer klassNo;
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klassNo = klass;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduceWith(Student student) {
        String introduction = "";
        introduction += super.introduce() + " I am a Teacher. ";
        if (klass.getNumber() == (student.getKlass().getNumber())) {
            introduction += "I teach " + student.getName() + ".";

        } else {
            introduction +="I don't teach " + student.getName() + ".";

        }
            return  introduction;

    }
//TODO
    public String introduce() {
        if(getKlass()!=null){
            return super.introduce() + String.format(" I am a Teacher. I teach %s.", klass.getDisplayName());
        } else{
            return super.introduce() + String.format(" I am a Teacher. I teach No Class.");
        }
    }

}
