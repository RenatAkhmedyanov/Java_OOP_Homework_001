package taskthree;

public class Pet {
    private String model;

    public Pet(String model) {
        this.model = model;
    }

      @Override
    public String toString() {
        return this.model;
    }


    public void goToBowl(String name) {
        System.out.println(name + " идёт к миске с едой.");
    }

}
