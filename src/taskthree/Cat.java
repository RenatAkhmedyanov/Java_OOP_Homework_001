package taskthree;

public class Cat extends Pet {
    public Cat(String name, int age, String color, String breed) {
        super(name, age, color, breed);
    }

    @Override
    public void toGoForAWalk() {
        System.out.println(super.getName() + " полностью игнорирует человека.");
    }

    @Override
    public void play() {
        System.out.println(super.getName() + " шуршит пакетом.");
    }
}
