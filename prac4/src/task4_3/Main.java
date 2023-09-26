package task4_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        ShopListEntity korzina = new ShopListEntity(user);
        //инициализация магазина
        Initialization init = new Initialization();
        CatalogListEntity catList = init.init();

        boolean shopping = true;

        while(shopping)
        {
            CatalogEntity currentCatalog = catList.selectCatalog();
            if (currentCatalog != null)
            {
                Item currentItem = currentCatalog.selectItem();
                if (currentItem != null)
                {
                    System.out.print("Введите количество покупаемого товара: ");
                    Scanner sc = new Scanner(System.in);
                    int count=0;
                    if (sc.hasNextInt())
                    {
                        count = sc.nextInt();
                        if (count <= 0) {
                            count = 0;
                            System.out.println("Ошибка. Количество товара должно быть положительным");
                        }
                        if (count > 0) {
                            for (int i = 0; i < count; i++)
                                korzina.addItem(currentItem);
                            System.out.println("Добавлено " + count + " единиц товара в корзину.");
                        }
                    }
                }
                else
                {
                    System.out.println("Такой товар не найден");
                }
            }
            else
            {
                System.out.println("Такой каталог не найден");
            }
            System.out.println("Для перехода к оплате введите buy, для просмотра корзины - shoplist, для продолжения - любое другое слово: ");
            Scanner sc = new Scanner(System.in);
            while (sc.hasNextLine())
            {
                String inp = sc.nextLine();
                if (inp.equals("buy"))
                {
                    shopping = false;
                    korzina.buy();
                    break;
                }
                else if (inp.equals("shoplist"))
                {
                    korzina.showShopList();
                }
                else
                {
                    break;
                }
            }
        }

        System.out.println("Спасибо за покупку. Ждем вас снова.");
    }
}
