package task4;
import java.util.ArrayList;
public class Shop {
    ArrayList<Computer> AvailableComputers = new ArrayList<Computer>();
    int mac_address_amount = 0;

    public void addComputer (Computer newComputer)
    {
        AvailableComputers.add(newComputer);
    }

    public void removeComputer (Computer ComputerToRemove)
    {
        AvailableComputers.remove(ComputerToRemove);
    }

    public ArrayList<Computer> findComputers (String[] arg)
    {
        ArrayList<Computer> Computers = new ArrayList<Computer>();
        for (int i = 0; i < AvailableComputers.size(); i++) {
            if ((arg[0] != "x") && (AvailableComputers.get(i).getCpu() != arg[0])) {
                continue;
            }
            if ((arg[1] != "x") && (AvailableComputers.get(i).getGpu() != arg[1])) {
                continue;
            }
            if ((arg[2] != "x") && (AvailableComputers.get(i).getRam() < Float.parseFloat(arg[2]))) {
                continue;
            }
            if ((arg[3] != "x") && (AvailableComputers.get(i).getDisk_space() < Float.parseFloat(arg[3]))) {
                continue;
            }
            Computers.add(AvailableComputers.get(i));
        }
        if (!Computers.isEmpty()) return Computers;
        else
            return new ArrayList<Computer>();
    }

    public void createComputer (String[] arg)
    {
        Computer temp;
        mac_address_amount++;
        if (arg[0] != "x")
        {
            temp = new Computer(mac_address_amount, arg[0], arg[1], Float.parseFloat(arg[2]),
                    Float.parseFloat(arg[3]), arg[4]);
        }
        else temp = new Computer(mac_address_amount);
        this.addComputer(temp);
    }

    public ArrayList<Computer> getAvailableComputers() {
        return AvailableComputers;
    }
}
