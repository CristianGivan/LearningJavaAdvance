package ComparatorComparable;

import java.util.Comparator;

public class MintYearComparator implements Comparator<Coins> {
    @Override
    public int compare(Coins o1, Coins o2) {
        return Integer.valueOf(o1.getMintYear()).compareTo(o2.getMintYear());
    }
}
