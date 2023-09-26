package task4_3;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogListEntity implements CatalogList {
    ArrayList<CatalogEntity> catalogs;

    public CatalogListEntity() {
        catalogs = new ArrayList<>();
    }

    @Override
    public void showList() {
        for (CatalogEntity ce:catalogs)
        {
            ce.showCatalog();
        }
    }

    @Override
    public CatalogEntity selectCatalog() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите название каталога, который вы хотите выбрать. ");
        System.out.println("Доступные варианты: ");
        for (CatalogEntity ce:catalogs)
        {
            System.out.println(ce.getName());
        }
        String name = "";
        if (sc.hasNextLine())
            name = sc.nextLine();
        for (CatalogEntity ce:catalogs)
        {
            if (ce.getName().equals(name))
            {
                return ce;
            }
        }
        return null;
    }

    public void addCatalog(CatalogEntity ce)
    {
        catalogs.add(ce);
    }

    public void removeCatalog(CatalogEntity ce)
    {
        catalogs.remove(ce);
    }


}
