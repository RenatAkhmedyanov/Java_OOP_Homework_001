package taskthree;



public class Cat extends Pet {
    private String name;
    public Cat(String name){
        super("Кот");
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String voice() {
        return "Кот " + this.name + " говорит мяу";
    }
}
