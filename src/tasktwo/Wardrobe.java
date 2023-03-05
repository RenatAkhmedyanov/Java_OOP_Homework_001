package tasktwo;

public class Wardrobe {
    private String item;
    public FirstState firstState;
    public SecondState secondState;

    enum FirstState {
        assembled, disassembled
    }
    enum SecondState {
        opened, closed
    }

    public Wardrobe(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return this.item;
    }
}
