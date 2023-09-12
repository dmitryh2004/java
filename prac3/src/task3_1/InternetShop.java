package task3_1;
import java.util.ArrayList;
import java.util.Scanner;
public class InternetShop {
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Double> prices = new ArrayList<>();
    ArrayList<Integer> valutes = new ArrayList<>();

    public InternetShop() {

    }

    public void addName(String name, double price, int valute)
    {
        names.add(name);
        prices.add(price);
        valutes.add(valute);
    }

    public void removeName(String name)
    {
        if (names.contains(name))
        {
            int ind = names.indexOf(name);
            names.remove(name);
            prices.remove(ind);
            valutes.remove(ind);
        }
    }

    public void calcTotalSum()
    {
        int valute;
        System.out.println("Выберите валюту, в которой вы хотите оплатить покупку:");
        System.out.println("Варианты: 0 - рубль, 1 - доллар, 2 - евро, 3 - юань, " +
                "4 - фунт стерлингов");
        Scanner sc = new Scanner(System.in);
        while(true) {
            if (sc.hasNextInt()) {
                valute = sc.nextInt();
                if (valute >= 0 && valute <= 4)
                    break;
                else System.out.println("Неверный ввод");
            }
        }
        double sum = 0.0;
        ValutesConverter vc = new ValutesConverter();
        for (int i = 0; i < prices.size(); i++)
        {
            sum += vc.Convert(prices.get(i), valutes.get(i), valute);
        }
        String valutesign = "";
        switch(valute)
        {
            case 0:
                valutesign = "RUB"; break;
            case 1:
                valutesign = "USD"; break;
            case 2:
                valutesign = "EUR"; break;
            case 3:
                valutesign = "юань"; break;
            case 4:
                valutesign = "фунт стерлингов"; break;
        }
        System.out.printf("К оплате: %.2f " + valutesign, sum);
    }
}
