package tasks2_3_4;

import java.util.Scanner;

public class ExceptionDemo {
    public void exceptionDemo1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число -> ");
        String aString = sc.nextLine();
        int a = Integer.parseInt(aString);
        System.out.println( 2.0 / a );
    }
    public void exceptionDemo2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число -> ");
        try {
            String aString = sc.nextLine();
            int a = Integer.parseInt(aString);
            System.out.println( 2.0 / a );
        }
        catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не число или оно не целое");
        }
        catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        }
    }
    public void exceptionDemo3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число -> ");
        try {
            String aString = sc.nextLine();
            int a = Integer.parseInt(aString);
            System.out.println( 2.0 / a );
        }
        catch (Exception e) {
            System.out.println("Что-то пошло не так...");
        }
        /*catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не число или оно не целое");
        }
        catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        }*/
    }
    public void exceptionDemo4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число -> ");
        try {
            String aString = sc.nextLine();
            int a = Integer.parseInt(aString);
            System.out.println( 2.0 / a );
        }
        catch (Exception e) {
            System.out.println("Что-то пошло не так...");
        }
        finally {
            System.out.println("Конец программы");
        }
    }
}
