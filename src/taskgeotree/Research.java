package taskgeotree;

import java.util.ArrayList;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName() && t.re == re) {
                result.add(t.p2.getFullName());
            }
        }
        return result;
    }

    public ArrayList<String> grandParents(Person p, String genderGP) {
        ArrayList<String> names = new ArrayList<>();
        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName() && t.re == Relationship.children ) {
                names.add(t.p2.getFullName());
            }
        }
        for (String s: names) {
            for (Node t : tree) {
                if (t.p1.getFullName() == s && t.re == Relationship.children && t.p2.getGender().equals(genderGP)) {
                    result.add(t.p2.getFullName());
                }
            }
        }
        return result;
    }

}
