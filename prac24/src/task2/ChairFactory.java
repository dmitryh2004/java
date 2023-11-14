package task2;

public class ChairFactory implements AbstractChairFactory {
    int victorianChairAge;

    public ChairFactory(int age) {
        this.victorianChairAge = age;
    }

    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(victorianChairAge);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
