package taskthree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Person petya = new Person("Петя");
        Cat catPersik = new Cat("Персик", 1, "Рыжий", "Абиссинский кот");
        Cat catBarsik = new Cat("Барсик", 2, "Серый", "Британец");
        Dog dogSnezhinka = new Dog("Снежинка", 4, "Белый", "Самоед");
        Dog dogLayka = new Dog("Лайка", 3, "Белый", "Хаски ");

        petya.callPetToWalk(catPersik);
        catPersik.toGoForAWalk();

        petya.callPetToWalk(dogSnezhinka);
        dogSnezhinka.toGoForAWalk();

        catPersik.play();
        dogSnezhinka.play();

        System.out.println("----------");

        ArrayList<Pet> list = new ArrayList<>();
        list.add(catBarsik);
        list.add(dogSnezhinka);
        list.add(catPersik);
        list.add(dogLayka);

        Collections.sort(list, new PetNameComparator());
        System.out.println("Имена питомцев по алфавиту: " + list);

        Iterator<Pet> iterator = list.iterator();
        while (iterator.hasNext()){
            Pet next = iterator.next();
            System.out.println(next + ", " + next.getAge());
            if (next.getAge() < 3){
                iterator.remove();
            }
        }
        System.out.println("Питомцы старше двух лет: " + list);

        System.out.println("Коты имеют одинаковый окрас? -" + catBarsik.equals(catPersik));
        System.out.println("Собаки имеют одинаковый окрас? -" + dogLayka.equals(dogSnezhinka));

    }
}
