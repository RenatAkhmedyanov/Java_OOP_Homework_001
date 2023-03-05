package taskthree;

public class Main {
    public static void main(String[] args) {
        Person petya = new Person("Петя");
        Cat catPersik = new Cat("Персик");
        Dog dogSnezhinka = new Dog("Снежинка");


        petya.callPet(catPersik.getName());
        System.out.println(catPersik.voice());

        petya.callPet(dogSnezhinka.getName());
        System.out.println(dogSnezhinka.voice());

        petya.feedPet();
        catPersik.goToBowl(catPersik.getName());
        dogSnezhinka.goToBowl(dogSnezhinka.getName());
    }
}
