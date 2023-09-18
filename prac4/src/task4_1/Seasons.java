package task4_1;

public enum Seasons {
    WINTER(-20.0),
    SPRING(10.0),
    SUMMER(30.0) {
        String getDescription()
        {
            return "Теплое время года";
        }
    },
    AUTUMN(5.0);

    private final int code;
    private double average_temp;

    Seasons(double av_t)
    {
        this.average_temp = av_t;
        if (av_t == -20) {
            this.code = 0;
        }
        else if (av_t == 10) {
            this.code = 1;
        }
        else if (av_t == 30) {
            this.code = 2;
        }
        else if (av_t == 5) {
            this.code = 3;
        }
        else {
            this.average_temp = -20;
            this.code = 0;
        }
    }

    String getDescription()
    {
        return "Холодное время года";
    }

    public String toString()
    {
        String res = "";
        switch (this.code) {
            case 0 -> res += "Зима ";
            case 1 -> res += "Весна ";
            case 2 -> res += "Лето ";
            case 3 -> res += "Осень ";
        }
        res += "- " + this.getDescription() + ", средняя температура - " + this.average_temp + " градусов";
        return res;
    }
}
