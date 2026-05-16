package Session07.b3;

public class AnimalTest {
    public static void main(String[] args) {
        Cat myCat = new Cat("Tom", 3, "Chinchilla");
        System.out.println("Cat Name: " + myCat.getName() + ", Age: " + myCat.getAge());
        myCat.makeSound();
        myCat.bark();
        System.out.println();
        Dog myDog = new Dog("Shibal", 3, "Yellow");
        System.out.println("Dog Name: " + myDog.getName() + ", Age: " + myDog.getAge());
        myDog.makeSound();
        myDog.meow();
    }
}
