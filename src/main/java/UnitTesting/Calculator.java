package UnitTesting;

public class Calculator {
    public int add (int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b) throws DividedByZero{
        if(b==0){
            throw new DividedByZero("The number cannot be divided by zero");
        }
        return a/b;

    }
}
