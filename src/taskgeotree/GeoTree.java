package taskgeotree;

import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

//    public void append(Person parent, Person children) {
//        tree.add(new Node(parent, Relationship.parent, children));
//        tree.add(new Node(children, Relationship.children, parent));
//    }
    public void append(Person person1, Relationship re1, Person person2, Relationship re2) {
        tree.add(new Node(person1, re1, person2));
        tree.add(new Node(person2, re2, person1));
    }


}
