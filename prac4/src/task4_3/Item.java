package task4_3;

public class Item {
    String name;
    int price;
    ItemType type;

    public Item(String name, int price, ItemType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString()
    {
        String res = "Товар ";
        res += name;
        res += ", цена - " + price + " р.";
        return res;
    }
}
