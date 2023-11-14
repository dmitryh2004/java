package task2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}
