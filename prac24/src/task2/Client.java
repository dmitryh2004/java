package task2;

public class Client {
    Chair chair;

    public void sit() {
        System.out.println("Я сижу на стуле " + chair.toString());
        switch (chair.getClass().getSimpleName()) {
            case "VictorianChair":
                System.out.println("Этому стулу " + ((VictorianChair) chair).getAge() + " лет!");
                break;
            case "MagicChair":
                ((MagicChair) chair).doMagic();
                break;
            case "FunctionalChair":
                System.out.println("2 + 5 = " + ((FunctionalChair) chair).sum(2, 5));
                break;
        }
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
