package practice10;
import java.util.LinkedList;
public class Teacher extends Person{


    private LinkedList<Klass> classes;
    public Teacher(int id, String name, int age){
        super(id, name, age);
        this.classes = new LinkedList<>();
    }


    public Teacher(int id, String name, int age, LinkedList<Klass> classes){
        super(id, name, age);
        this.classes = classes;
        for(Klass klass : classes){
            klass.setTeacher(this);
        }
    }

    @Override
    public String introduce() {
        String introduce = " I am a Teacher. I teach ";
        String classesList = "";
        if(classes.size() > 0) {
            classesList = "Class " + classes.get(0).getNumber();
            for (int i = 1; i < classes.size(); i++) {
                classesList += ", " + classes.get(i).getNumber();
            }
        } else {
            classesList = "No Class";
        }
        return super.introduce() + introduce + classesList + ".";
    }

    public String introduceWith(Student student){
        String introduce = super.introduce() + " I am a Teacher. ";
        if(isTeaching(student)){
            return introduce + String.format("I teach %s.", student.getName());
        } else {
            return introduce + String.format("I don't teach %s.", student.getName());
        }
    }

    public Boolean isTeaching(Student student){
        boolean isTeaching = false;
        for (Klass item : classes){
            if(item.isIn(student))
                isTeaching = true;
        }
        return isTeaching;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }
}