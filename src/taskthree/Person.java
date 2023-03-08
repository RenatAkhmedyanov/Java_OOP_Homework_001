package taskthree;

public class Person implements CallToWalk {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public void callPetToWalk(Pet pet) {
        System.out.println(this.name + " зовёт гулять " + pet);
    }

}
