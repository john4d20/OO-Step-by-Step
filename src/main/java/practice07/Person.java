package practice07;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }
//TODO
    @Override
    public boolean equals(Object person) {
        if (person.getClass() == this.getClass()) {
            Person guest = (Person) person;
            return guest.id == id;
        }
        return false;
    }
}
