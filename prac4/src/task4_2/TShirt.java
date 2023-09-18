package task4_2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {

    @Override
    public void dressMan() {
        System.out.println("Футболка мужская - цвет: " + this.color + ", цена: " + this.price + ", размер - "
        + this.size.getDescription() + "(" + this.size + ")");
    }

    @Override
    public void dressWoman() {
        System.out.println("Футболка женская - цвет: " + this.color + ", цена: " + this.price + ", размер - "
                + this.size.getDescription() + "(" + this.size + ")");
    }
}
