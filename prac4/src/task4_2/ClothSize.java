package task4_2;

public enum ClothSize {
    XXS(32) {
        String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;
    ClothSize(int euroSize)
    {
        this.euroSize = euroSize;
    }

    String getDescription() {
        return "Взрослый размер";
    }

    public String toString()
    {
        return "" + euroSize;
    }
}
