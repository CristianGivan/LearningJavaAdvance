package Lessons.GenericType;

public class SimpleClass {
    public  <T> void printArray(T[] array){
        for (int i=0; i< array.length; i++){
            System.out.print(array[i]);
        }
    }

    public <TT> void printTTArray(TT[] array){
        for (int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }
}
