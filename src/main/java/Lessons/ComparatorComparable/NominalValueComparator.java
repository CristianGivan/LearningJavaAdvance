package Lessons.ComparatorComparable;

import java.util.Comparator;

public class NominalValueComparator implements Comparator <Coins> {
    @Override
    public int compare(Coins o1, Coins o2) {
        return Integer.valueOf(o1.getNominalValue()).compareTo(o2.getNominalValue());
    }
}
