package Lessons.GenericType;

public class GenericCalss <T>{
    private T t;

    public GenericCalss (T t){
        this.t=t;

    }
    public T getT(){
        return this.t;
    }
    public void setT(T t){
        this.t=t;
    }
}
