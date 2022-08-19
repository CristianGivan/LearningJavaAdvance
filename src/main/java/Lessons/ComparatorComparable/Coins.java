package Lessons.ComparatorComparable;

public class Coins implements Comparable<Coins>{

    private String name;
    private int nominalValue;
    private int mintYear;

    public Coins(String name, int nominalValue, int mintYear) {
        this.name = name;
        this.nominalValue = nominalValue;
        this.mintYear = mintYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNominalValue() {
        return nominalValue;
    }

    public void setNominalValue(int nominalValue) {
        this.nominalValue = nominalValue;
    }

    public int getMintYear() {
        return mintYear;
    }

    public void setMintYear(int mintYear) {
        this.mintYear = mintYear;
    }

    @Override
    public int compareTo(Coins otherCoin) {
        return Integer.valueOf(this.mintYear).compareTo(otherCoin.getMintYear());
    }

    @Override
    public String toString() {
        return "Coins{" +
                "name='" + name + '\'' +
                ", nominalValue=" + nominalValue +
                ", mintYear=" + mintYear +
                '}';
    }
}
