package Session07.b3;

public class Dog extends Animal {
    private String color;

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    void meow(){
        System.out.println("Meow meow");
    };
}
