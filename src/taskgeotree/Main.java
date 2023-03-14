package taskgeotree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", "ж");
        Person vasya = new Person("Вася", "м");
        Person masha = new Person("Маша", "ж");
        Person jane = new Person("Женя", "ж");
        Person ivan = new Person("Ваня", "м");
        Person nikolai = new Person("Николай", "м");
        Person svetlana = new Person("Светлана", "ж");
        Person egor = new Person("Егор", "м");
        Person yana = new Person("Яна", "ж");
        Person petya = new Person("Петя", "м");
        Person nikita = new Person("Никита", "м");
        Person sasha = new Person("Саша", "м");
        Person victor = new Person("Виктор", "м");
        Person victoria = new Person("Виктория", "ж");

        GeoTree gt = new GeoTree();
        gt.append(irina, Relationship.parent, vasya, Relationship.children);
        gt.append(irina, Relationship.parent, masha, Relationship.children);
        gt.append(sasha, Relationship.parent, vasya, Relationship.children);
        gt.append(sasha, Relationship.parent, masha, Relationship.children);


        gt.append(nikolai, Relationship.parent, irina, Relationship.children);
        gt.append(svetlana, Relationship.parent, irina, Relationship.children);
        gt.append(victor, Relationship.parent, sasha, Relationship.children);
        gt.append(victoria, Relationship.parent, sasha, Relationship.children);



        gt.append(nikolai, Relationship.parent, egor, Relationship.children);
        gt.append(svetlana, Relationship.parent, egor, Relationship.children);
        gt.append(nikolai, Relationship.parent, yana, Relationship.children);
        gt.append(svetlana, Relationship.parent, yana, Relationship.children);
        gt.append(nikolai, Relationship.parent, nikita, Relationship.children);
        gt.append(svetlana, Relationship.parent, nikita, Relationship.children);

        gt.append(irina, Relationship.sister, nikita, Relationship.brother);
        gt.append(irina, Relationship.sister, egor, Relationship.brother);
        gt.append(irina, Relationship.sister, yana, Relationship.sister);
        gt.append(egor, Relationship.brother, yana, Relationship.sister);


        gt.append(vasya, Relationship.parent, jane, Relationship.children);
        gt.append(vasya, Relationship.parent, ivan, Relationship.children);

        System.out.println("Дети Ирины: " + new Research(gt).spend(irina, Relationship.parent));
        System.out.println("Родители Васи: " + new Research(gt).spend(vasya, Relationship.children));
        System.out.println("Родители Ирины: " + new Research(gt).spend(irina, Relationship.children));
        System.out.println("Родители Саши: " + new Research(gt).spend(sasha, Relationship.children));
        System.out.println("Дедушки Васи: " + new Research(gt).grandParents(vasya , "м"));
        System.out.println("Бабушки Васи: " + new Research(gt).grandParents(vasya, "ж"));
        System.out.println("Дети Николая и Светланы: " + new Research(gt).spend(nikolai, Relationship.parent));
        System.out.println("Для кого Ирина является сестрой: " + new Research(gt).spend(irina, Relationship.sister));

        System.out.println("--------");
        ArrayList<String> list = new ArrayList<>(new Research(gt).spend(nikolai, Relationship.parent));
        Collections.sort(list, new PersonNameComparator());
        System.out.println("Дети Николая и Светланы по алфавиту: " + list);
        Iterator<String> iterator = list.iterator();
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите имя для проверки: ");
        String input = scn.nextLine();
        int count = 0;
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.equals(input)){
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Искомый человек является ребенком Николая и Светланы!");
        } else {
            System.out.println("Искомый человек не является ребенком Николая и Светланы!");
        }



        list = new Research(gt).spend(irina, Relationship.sister);
        Collections.sort(list, new PersonNameComparator());
        System.out.println("Братья и сестры Ирины по алфавиту: " + list);


    }

}
