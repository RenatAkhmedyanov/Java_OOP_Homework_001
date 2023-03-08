package taskthree;

public class Dog extends Pet{
    public Dog(String name, int age, String color, String breed) {
        super(name, age, color, breed);
    }

    @Override
    public void toGoForAWalk() {
        System.out.println(super.getName() + " c радостью бежит на улицу.");
    }

    @Override
    public void play() {
        System.out.println(super.getName() + " играет с мячом.");
    }
}
