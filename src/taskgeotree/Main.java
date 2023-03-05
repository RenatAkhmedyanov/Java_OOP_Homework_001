package taskgeotree;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");
        Person nikolai = new Person("Николай");
        Person svetlana = new Person("Светлана");
        Person egor = new Person("Егор");
        Person yana = new Person("Яна");
        Person petya = new Person("Петя");

        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);


        gt.append(nikolai, irina);
        gt.append(svetlana, irina);
        gt.append(nikolai, egor);
        gt.append(svetlana, egor);
        gt.append(nikolai, yana);
        gt.append(svetlana, yana);
        gt.appendBroSister(irina, egor);
        gt.appendBroSister(irina, yana);

        gt.append(vasya, jane);
        gt.append(vasya, ivan);

        System.out.println("Дети Ирины: " + new Research(gt).spend(irina, Relationship.parent));
        System.out.println("Родители Васи: " + new Research(gt).spend(vasya, Relationship.children));
        System.out.println("Родители Ирины: " + new Research(gt).spend(irina, Relationship.children));
        System.out.println("Братья/сестры Ирины: " + new Research(gt).spend(irina, Relationship.broSister));
        System.out.println("Дедушки/Бабушки Васи: " + new Research(gt).grandParents(vasya));
        System.out.println("Дедушки/Бабушки Жени: " + new Research(gt).grandParents(jane));



    }

}
