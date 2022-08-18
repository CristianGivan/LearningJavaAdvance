package ComparatorComparable;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //test();
        //test2();
        test3();
    }

    public static void test() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(33);
        numbers.add(22);
        numbers.add(11);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);


    }
    public static void test2(){
        Car car =new Car(2000,"Dacia","gri",1500);
        Car car1 = new Car(30000, "BMW", "white", 1400);
        Car car2 = new Car(25000, "Mercedes", "black", 2000);
        Car car3 = new Car(20000, "Volvo", "blue", 1800);
        List<Car> cars=new ArrayList<>();
        cars.add(car);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);
    }
    public static void test3(){
        Coins coin1 =new Coins("c1",10,2001);
        Coins coin2 =new Coins("c2",30,2002);
        Coins coin3 =new Coins("c3",20,2004);
        Coins coin4 =new Coins("c4",40,2003);

        List <Coins> coins=new ArrayList<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        System.out.println(coins);
        Collections.sort(coins);
        System.out.println(coins);
        coins.sort(new NominalValueComparator());
        System.out.println(coins);
        coins.sort(new MintYearComparator());
        System.out.println(coins);
    }


}
