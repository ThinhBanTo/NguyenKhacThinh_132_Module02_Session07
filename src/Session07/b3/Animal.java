package Session07.b3;

public class Animal {
    //atribute:
    protected String name;
    protected int age;
    //constructor

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //methods:

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void makeSound() {
        System.out.print("Animal is making sound: ");
    }
}
