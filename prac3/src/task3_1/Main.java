package task3_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InternetShop i_s = new InternetShop();


        String name = "";
        double price = 0.0;
        int valute = 0;
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            name = "";
            price = 0.0;
            valute = 0;
            System.out.print("Введите название товара или \"0-0\", чтобы перейти к оплате - ");
            if (sc.hasNextLine()) {
                name = sc.nextLine();
                if (name.equals("0-0")) break;
                System.out.print("Введите цену - ");
                if (sc.hasNextDouble()) {
                    price = sc.nextDouble();
                    if (price <= 0.0) {
                        System.out.println("Цена должна быть больше 0. Повторите попытку");
                        continue;
                    }
                    System.out.println("Валюта (варианты: 0 - рубль, 1 - доллар, 2 - евро, 3 - юань, 4 - фунт стерлингов) - ");
                    if (sc.hasNextInt()) {
                        valute = sc.nextInt();
                        if (valute < 0 || valute > 4)
                        {
                            System.out.println("Неверная валюта. Повторите попытку");
                            continue;
                        }
                        i_s.addName(name, price, valute);
                    }
                }
            }
        }
        i_s.calcTotalSum();
    }
}
