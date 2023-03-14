package taskthree;

public abstract class Pet implements Walking, Playing {
    private String name;
    private int age;
    private String color;
    private String breed;

    public Pet(String name, int age, String color, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        } else if (this.getClass() != obj.getClass()){
            return false;
        } else return this.getColor().equals(((Pet) obj).getColor());
    }
}
