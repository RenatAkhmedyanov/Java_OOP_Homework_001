package tasktwo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
    public void assemble(Wardrobe wardrobe) throws InterruptedException {
        if (wardrobe.firstState == Wardrobe.FirstState.disassembled) {
            System.out.println(wardrobe + " разобран :(");
            System.out.println(this.name + " читает инструкцию по сборке...");
            System.out.println("A few moments later...");
            Thread.sleep(2000);
            System.out.println("Инструкция прочитана!");
            System.out.println("A few moments later...");
            Thread.sleep(2000);
            System.out.println(wardrobe + " собран и закрыт!");
            wardrobe.firstState = Wardrobe.FirstState.assembled;
            wardrobe.secondState = Wardrobe.SecondState.closed;
        } else {
            System.out.println(wardrobe + " уже собран!");
        }
    }

    public void disassemble(Wardrobe wardrobe) throws InterruptedException{
        if (wardrobe.firstState == Wardrobe.FirstState.assembled) {
            System.out.println("Нужно перевезти шкаф в другую квартиру.");
            System.out.println(wardrobe + " не влезает в машину. Придется разбирать.");
            Thread.sleep(1000);
            System.out.println("A few moments later...");
            Thread.sleep(2000);
            System.out.println(this.name + " разобрал " + wardrobe);
            wardrobe.firstState = Wardrobe.FirstState.disassembled;
        } else {
            System.out.println(wardrobe + " уже разобран!");
        }
    }

    public void open(Wardrobe wardrobe){
        if (wardrobe.secondState == Wardrobe.SecondState.closed){
            System.out.println(this.name + " открывает шкаф");
            wardrobe.secondState = Wardrobe.SecondState.opened;
        } else {
            System.out.println("Шкаф уже открыт!");
        }
    }
    public void close(Wardrobe wardrobe){
        if (wardrobe.secondState == Wardrobe.SecondState.opened){
            System.out.println(this.name + " закрывает шкаф");
            wardrobe.secondState = Wardrobe.SecondState.closed;
        } else {
            System.out.println("Шкаф уже закрыт!");
        }
    }

    public void put(Wardrobe wardrobe){
        if (wardrobe.secondState == Wardrobe.SecondState.opened){
            System.out.println(this.name + " кладет вещи в " + wardrobe);
        } else {
            System.out.println("Сначала нужно открыть " + wardrobe);
        }
    }
}
