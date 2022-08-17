package Colections;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {
        //testLists();
        //testSets();
        testMap();
    }

    public static void testLists() {
        List<Integer> numbers = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        System.out.println(numbers.isEmpty());
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers.contains(20));
        System.out.println(numbers.contains(Integer.parseInt("20")));
        System.out.println(numbers.contains(240));
        System.out.println(numbers.isEmpty());
        System.out.println(numbers);
        System.out.println(numbers.size());
        for (Integer number : numbers) {
            numbers.set(numbers.indexOf(number), number * 2);
            System.out.println(numbers.size());
        }
        System.out.println(numbers);
        numbers.add(100);
        System.out.println(numbers);
        numbers.remove(2);
        System.out.println(numbers);
        strings.add("d");
        System.out.println(strings);
        strings.remove("d");
        System.out.println(strings);
        strings.remove(1);
        System.out.println(strings);
        System.out.println(numbers.size());
        numbers.clear();
        System.out.println(numbers.size());
        System.out.println(numbers);
        List<String> additionalStrings = Arrays.asList("aa", "bb", "cc");
        strings.addAll(additionalStrings);
        System.out.println(strings);
        System.out.println(strings.contains("cc"));
        System.out.println(strings.contains("cd"));
        strings.set(2, "ab");
        System.out.println(strings);
        System.out.println(strings.get(1));
        System.out.println(strings.indexOf("bb"));
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }

    public static void testSets() {
        Set<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        System.out.println(strings);
        strings.remove("b");
        System.out.println(strings);
        strings.add("bb");
        System.out.println(strings);
        System.out.println(strings.isEmpty());
        System.out.println(strings.contains("c"));
        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void testMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "a");
        map.put(11, "b");
        System.out.println(map);
        Set<String> s1 = new HashSet<>();
        s1.add("a");
        s1.add("aa");
        Set<String> s2 = new HashSet<>();
        s2.add("b");
        s2.add("bb");
        Map<Integer, Set<String>> m1 = new HashMap<>();
        m1.put(1, s1);
        m1.put(2, s2);
        System.out.println(m1);
        System.out.println(m1.get(1));
        //map.remove(10);
        System.out.println(map);
        System.out.println(map.containsKey(10));
        System.out.println(map.containsKey(1110));
        System.out.println(map.containsValue("b"));
        System.out.println(map.containsValue("c"));
        System.out.println(m1.keySet());
        System.out.println(m1.values());
        /*Set<Map<Integer, String>> set = m1.entrySet();
        System.out.println(set.contains(10, "a"));*/
        Set<String>ms=new HashSet<>();
        for (Integer index : m1.keySet()) {
            ms.addAll(m1.get(index));
        }
        System.out.println(ms);
    }


    public static void test() {
        {
            List<String> strings = new ArrayList<>();
            Set<String> strings1 = new HashSet<>();
        }
        {
            List<Integer> in = new ArrayList<>();
            Set<Integer> integers = new HashSet<>();
            List<String> newint = Arrays.asList("a", "b", "c");
        }
    }
}
