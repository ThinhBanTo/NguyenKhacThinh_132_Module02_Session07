package Session07.b3;

public class Cat extends Animal {
    //1:
    private String breed;
    //2:

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    //3:
    void bark(){
        System.out.println("Gau gau");
    }
}
