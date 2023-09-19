package task4_3;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        ShopListEntity korzina = new ShopListEntity(user);
        //инициализация магазина
        CatalogEntity catalogFood = new CatalogEntity("Еда");
        CatalogEntity catalogCantselyaria = new CatalogEntity("Канцелярия");
        CatalogEntity catalogComputer = new CatalogEntity("Компьютерные комплектующие");
        CatalogEntity catalogBuilding = new CatalogEntity("Все для ремонта");
        CatalogEntity catalogOther = new CatalogEntity("Прочее");

        CatalogListEntity catList = new CatalogListEntity();
        catList.addCatalog(catalogFood);
        catList.addCatalog(catalogCantselyaria);
        catList.addCatalog(catalogComputer);
        catList.addCatalog(catalogBuilding);
        catList.addCatalog(catalogOther);

        CatalogEntity currentCatalog = catList.selectCatalog();
        if (currentCatalog != null)
        {
            Item currentItem = currentCatalog.selectItem();
            if (currentItem != null)
            {
                System.out.print("Введите количество покупаемого товара: ");
            }
        }
    }
}
