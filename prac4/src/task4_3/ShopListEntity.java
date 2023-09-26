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
        ArrayList<Item> items = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<Integer>();
        int total = 0;
        System.out.println("=========================");
        System.out.println("Список товаров в корзине");
        for (Item item: shopList)
        {
            if (!items.contains(item))
            {
                items.add(item);
                count.add(1);
            }
            else {
                int index = items.indexOf(item);
                int amount = count.get(index);
                amount++;
                count.set(index, amount);
            }
            total += item.getPrice();
        }
        for (Item item: items)
        {
            int index = items.indexOf(item);
            System.out.println(item + ", количество: " + count.get(index) + " шт.");
        }
        System.out.println("Итоговая сумма товаров: " + total + " р.");
        System.out.println("=========================");
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
