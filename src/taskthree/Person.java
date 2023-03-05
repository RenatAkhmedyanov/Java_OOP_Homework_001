package taskthree;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return this.name;
    }

    public void callPet(String name){
        System.out.println(this.name + " зовёт " + name);
    }

    public void feedPet(){
        System.out.println((this.name + " кладет еду в миску."));
    }


}
