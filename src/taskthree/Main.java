package taskthree;

public class Main {
    public static void main(String[] args) {
        Person petya = new Person("Петя");
        Cat catPersik = new Cat("Персик", 1, "Рыжий", "Абиссинский кот");
        Dog dogSnezhinka = new Dog("Снежинка", 4, "Белый", "Самоед");

        petya.callPetToWalk(catPersik);
        catPersik.toGoForAWalk();

        petya.callPetToWalk(dogSnezhinka);
        dogSnezhinka.toGoForAWalk();

        catPersik.play();
        dogSnezhinka.play();

    }
}
