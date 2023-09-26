package task4_3;

import java.util.ArrayList;

public class Initialization {
    ArrayList<Item> items;

    public CatalogListEntity init()
    {
        items = new ArrayList<>();
        CatalogListEntity cle = new CatalogListEntity();
        Item black_bread = new Item("Хлеб черный", 40, ItemType.FOOD);
        items.add(black_bread);
        Item white_bread = new Item("Хлеб белый", 46, ItemType.FOOD);
        items.add(white_bread);
        Item butter = new Item("Масло сливочное", 120, ItemType.FOOD);
        items.add(butter);
        Item cheese = new Item("Сыр Ламбер", 350, ItemType.FOOD);
        items.add(cheese);
        Item kolbasa = new Item("Колбаса Докторская", 400, ItemType.FOOD);
        items.add(kolbasa);
        Item buscuit = new Item("Печенье овсяное", 150, ItemType.FOOD);
        items.add(buscuit);
        Item snickers = new Item("Snickers белый", 95, ItemType.FOOD);
        items.add(snickers);
        Item twix = new Item("Twix ультра", 95, ItemType.FOOD);
        items.add(twix);
        Item pen = new Item("Ручка синяя шариковая", 4, ItemType.CANTSELYARIA);
        items.add(pen);
        Item pencil = new Item("Карандаш простой", 4, ItemType.CANTSELYARIA);
        items.add(pencil);
        Item paper = new Item("Бумага А4 500 листов", 400, ItemType.CANTSELYARIA);
        items.add(paper);
        Item flomaster = new Item("Набор фломастеров (24)", 260, ItemType.CANTSELYARIA);
        items.add(flomaster);
        Item i5_12500 = new Item("Intel Core i5-12500", 20000, ItemType.COMPUTER);
        items.add(i5_12500);
        Item i7_12700kf = new Item("Intel Core i7-12700kf", 50000, ItemType.COMPUTER);
        items.add(i7_12700kf);
        Item rtx3060ti = new Item("Geforce RTX 3060 Ti", 40000, ItemType.COMPUTER);
        items.add(rtx3060ti);
        Item paint = new Item("Строительная краска 1 литр", 40, ItemType.BUILDING);
        items.add(paint);
        Item wallpaper = new Item("Обои 1 рулон", 120, ItemType.BUILDING);
        items.add(wallpaper);
        Item hammer = new Item("Молоток 250 грамм", 120, ItemType.BUILDING);
        items.add(hammer);
        Item bitcoin = new Item("0.001 биткоина", 2526, ItemType.OTHER);
        items.add(bitcoin);

        CatalogEntity catalogFood = new CatalogEntity("Еда");
        CatalogEntity catalogCantselyaria = new CatalogEntity("Канцелярия");
        CatalogEntity catalogComputer = new CatalogEntity("Компьютерные комплектующие");
        CatalogEntity catalogBuilding = new CatalogEntity("Все для ремонта");
        CatalogEntity catalogOther = new CatalogEntity("Прочее");

        for (Item i : items)
        {
            switch(i.type)
            {
                case FOOD: catalogFood.addItem(i); break;
                case CANTSELYARIA: catalogCantselyaria.addItem(i); break;
                case COMPUTER: catalogComputer.addItem(i); break;
                case BUILDING: catalogBuilding.addItem(i); break;
                case OTHER: catalogOther.addItem(i); break;
            }
        }

        cle.addCatalog(catalogFood);
        cle.addCatalog(catalogCantselyaria);
        cle.addCatalog(catalogComputer);
        cle.addCatalog(catalogBuilding);
        cle.addCatalog(catalogOther);
        return cle;
    }
}
