package tasktwo;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Person petya = new Person("Петя");
        Person sveta = new Person("Света");
        Person dima = new Person("Дима");
        Wardrobe wardrobe = new Wardrobe("Шкаф");


        wardrobe.firstState = Wardrobe.FirstState.disassembled;

        petya.assemble(wardrobe);

        sveta.open(wardrobe);
        sveta.put(wardrobe);
        sveta.close(wardrobe);

        dima.disassemble(wardrobe);
    }
}
