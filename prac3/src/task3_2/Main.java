package task3_2;

public class Main {
    public static void main(String[] args) {
        Report r = new Report();
        r.addEmployee("Вася", 15000);
        r.addEmployee("Петя", 125000);
        r.addEmployee("Витя", 156000);
        r.addEmployee("Миша", 150800);
        r.addEmployee("Маша", 7500);
        r.addEmployee("Олег", 158000);
        r.addEmployee("Игорь", 215);
        r.addEmployee("Костя", 153000);
        r.addEmployee("Федор", 151000);
        r.generateReport();
    }
}
