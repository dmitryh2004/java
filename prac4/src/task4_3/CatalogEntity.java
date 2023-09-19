package task4_3;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogEntity implements Catalog {
    String name;
    ArrayList<Item> items;
    @Override
    public void showCatalog() {
        System.out.println("Список товаров в каталоге " + this.name + ":");
        for (Item item : items)
        {
            System.out.println(item);
        }
    }

    @Override
    public Item selectItem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите название товара, который вы хотите выбрать: ");
        String name = "";
        if (sc.hasNextLine())
            name = sc.nextLine();
        for (Item item: items)
        {
            if (item.getName().equals(name))
            {
                return item;
            }
        }
        return null;
    }

    public CatalogEntity(String name)
    {
        this.items = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addItem(Item item)
    {
        this.items.add(item);
    }

    public void removeItem(Item item)
    {
        this.items.remove(item);
    }
}
