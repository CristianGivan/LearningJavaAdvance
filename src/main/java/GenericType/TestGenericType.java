package GenericType;

public class TestGenericType {
    public static void main(String[] args) {
        //test1();
        test2();
    }

    public static void test1() {
        GenericCalss<Integer> type1 = new GenericCalss<>(200);
        GenericCalss<String> type2 = new GenericCalss<>("test");
        Integer number = type1.getT();
        String text = type2.getT();
        System.out.println(number + text);
    }

    public static void test2() {
        int[] ints = new int[]{1, 2, 3, 4, 5};
        Integer[] integers = new Integer[]{6, 7, 8, 8, 9};
        String[] strings = new String[]{"a", "b", "c", "d"};
        SimpleClass instance = new SimpleClass();
        instance.printArray(integers);
        instance.printArray(strings);
        System.out.println("-------");
        printArray(integers);
        printArray(strings);
    }

    public static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

}
