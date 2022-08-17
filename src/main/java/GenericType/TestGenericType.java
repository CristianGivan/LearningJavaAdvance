package GenericType;

public class TestGenericType {
    public static void main(String[] args) {
        test1();
    }
    public static void test1(){
        GenericCalss<Integer> type1=new GenericCalss<>(200);
        GenericCalss<String> type2=new GenericCalss<>("test");
        Integer number =type1.getT();
        String text=type2.getT();
        System.out.println(number+text);
        System.out.println("LearningJavaAdvance");
    }

}
