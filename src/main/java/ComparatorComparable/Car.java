package ComparatorComparable;

public class Car implements Comparable<Car>{
    private int price;
    private String model;
    private String color;
    private int weight;

    public Car(int price, String model, String color, int weight) {
        this.price = price;
        this.model = model;
        this.color = color;
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Car otherCar) {
        return Integer.valueOf(this.price).compareTo(otherCar.getPrice());
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
