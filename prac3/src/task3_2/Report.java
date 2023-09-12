package task3_2;

import java.text.DecimalFormat;
import java.util.ArrayList;
public class Report {
    ArrayList<Employee> employees = new ArrayList<>();

    public Report() {
    }

    public void addEmployee(String name, int salary)
    {
        employees.add(new Employee(name, salary));
    }

    public void generateReport()
    {
        for (int i = 0; i < employees.size(); i++)
        {
            System.out.printf("Name: %15s, salary: %10.2f\n", employees.get(i).getFullname(),(float) employees.get(i).getSalary());
        }
    }
}
