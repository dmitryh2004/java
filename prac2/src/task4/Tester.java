package task4;
import java.util.Scanner;
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop regard = new Shop();
        String input = "";
        String[] arg = new String[5];
        boolean running = true;
        while(running)
        {
            System.out.print("Введите действие (remove_mac, remove_params, find, create, show_all, exit): ");
            input = sc.nextLine();
            switch (input)
            {
                case "remove_mac":
                    System.out.print("Введите mac компьютера, который необходимо удалить: ");
                    int mac = sc.nextInt();
                    ArrayList<Computer> comps = regard.getAvailableComputers();
                    if (!comps.isEmpty()) {
                        for (int i = 0; i < comps.size(); i++) {
                            if (comps.get(i).getMac_address() == mac) {
                                Computer temp = comps.get(i);
                                regard.removeComputer(temp);
                            }
                        }
                    }
                    else
                    {
                        System.out.println("В базе данных нет ни одного компьютера.");
                    }
                case "remove_params":
                    System.out.print("Введите параметры компьютера, который необходимо удалить: (порядок ввода - cpu, gpu, ram, disk space, additional)");
                    for (int i = 0; i < 5; i++)
                        arg[i] = sc.nextLine();
                    Computer temp;
                    if (!regard.findComputers(arg).isEmpty())
                    {
                        temp = regard.findComputers(arg).get(0);
                        regard.removeComputer(temp);
                        System.out.println("Компьютер №" + temp.getMac_address() + " удален.");
                    }
                    else System.out.println("Компьютер с такими параметрами не найден.");
                    break;
                case "find":
                    System.out.print("Введите параметры компьютера для поиска (или \"х\" для того, чтобы показать, что " +
                            "этот параметр не нужен): (порядок ввода - cpu, gpu, ram, disk space, additional)");
                    for (int i = 0; i < 5; i++)
                        arg[i] = sc.nextLine();
                    if (!regard.findComputers(arg).isEmpty())
                    {
                        ArrayList<Computer> found = regard.findComputers(arg);
                        for (int i = 0; i < found.size(); i++)
                        {
                            System.out.println(found.get(i));
                        }
                    }
                    else System.out.println("Компьютеры с такими параметрами не найдены.");
                    break;
                case "create":
                    System.out.print("Введите параметры создаваемого компьютера: (порядок ввода - cpu, gpu," +
                            " ram, disk space, additional) ");
                    for (int i = 0; i < 5; i++)
                        arg[i] = sc.nextLine();
                    regard.createComputer(arg);
                    break;
                case "show_all":
                    ArrayList<Computer> comps1 = regard.getAvailableComputers();
                    if (!comps1.isEmpty()) {
                        for (int i = 0; i < comps1.size(); i++) {
                            System.out.println(comps1.get(i));
                        }
                    }
                    else
                    {
                        System.out.println("В базе данных нет ни одного компьютера.");
                    }
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    System.out.println("Некорректное действие");
            }
        }
    }
}
