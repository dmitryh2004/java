package task4_3;

import java.util.ArrayList;

public class ShopListEntity implements ShopList {
    ArrayList<Item> shopList;
    User owner;

    public ShopListEntity(User owner)
    {
        shopList = new ArrayList<>();
        this.owner = owner;
    }
    @Override
    public void addItem(Item item) {
        shopList.add(item);
    }

    @Override
    public void showShopList() {
        int total = 0;
        System.out.println("Список товаров в корзине");
        for (Item item: shopList)
        {
            System.out.println(item);
            total += item.getPrice();
        }
        System.out.println("Итоговая сумма товаров: " + total + " р.");
    }

    @Override
    public void removeItem(Item item) {
        shopList.remove(item);
    }

    @Override
    public void buy() {
        int total = 0;
        for (Item item: shopList)
        {
            total += item.getPrice();
        }
        System.out.println("Сумма покупки - " + total + " р.");
        if (owner.getBalance() < total)
        {
            System.out.println("На счету недостаточно средств для покупки");
        }
        else
        {
            owner.buy(total);
            System.out.println("Покупка совершена. Остаток на счету - " + owner.getBalance() + " р.");
        }
    }
}
