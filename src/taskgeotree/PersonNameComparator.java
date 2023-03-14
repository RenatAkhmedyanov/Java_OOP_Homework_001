package taskgeotree;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<String> {
    @Override
    public int compare(String p1, String p2) {
        return p1.compareTo(p2);
    }
}
