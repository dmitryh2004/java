package task3_1;
import java.util.ArrayList;

public class ValutesConverter {
    Double[][] courses = new Double[5][5];
    /*
    0 - рубль
    1 - доллар
    2 - евро
    3 - юань
    4 - фунт стерлингов
     */
    public ValutesConverter() {
        courses[0][0] = 1.0;
        courses[1][0] = 94.76;
        courses[2][0] = 101.62;
        courses[3][0] = 12.96;
        courses[4][0] = 118.1;
        this.courses[0][1] = 1 / courses[1][0];
        this.courses[0][2] = 1 / courses[2][0];
        this.courses[0][3] = 1 / courses[3][0];
        this.courses[0][4] = 1 / courses[4][0];
        this.courses[1][1] = 1.0;
        this.courses[1][2] = 0.93;
        this.courses[1][3] = 7.31;
        this.courses[1][4] = 0.8;
        this.courses[2][1] = 1 / courses[1][2];
        this.courses[3][1] = 1 / courses[1][3];
        this.courses[4][1] = 1 / courses[1][4];
        this.courses[2][2] = 1.0;
        this.courses[2][3] = 7.83;
        this.courses[2][4] = 0.86;
        this.courses[3][2] = 1 / courses[2][3];
        this.courses[4][2] = 1 / courses[2][4];
        this.courses[3][3] = 1.0;
        this.courses[3][4] = 0.11;
        this.courses[4][3] = 1 / this.courses[3][4];
        this.courses[4][4] = 1.0;
    }

    public double Convert (double amount, int start, int end)
    {
        return amount * courses[start][end];
    }
}
