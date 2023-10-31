package task1;

public class ExceptionDemo {
    public void exceptionDemo1() {
        System.out.println( 2 / 0 );
    }
    public void exceptionDemo2() {
        System.out.println( 2.0 / 0.0 );
    }
    public void exceptionDemo3() {
        try {
            System.out.println( 2 / 0 );
        }
        catch(ArithmeticException e) {
            System.out.println("Попытка деления на ноль");
        }
    }
}
