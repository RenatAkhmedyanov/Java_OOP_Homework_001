package taskthree;

public class Dog extends Pet{
    private String name;
    public Dog(String name){
        super("Собака");
        this.name = name;
    }
    public String voice() {
        return "Собака " + this.name + " говорит гав-гав";
    }
    public String getName() {
        return name;
    }
}
