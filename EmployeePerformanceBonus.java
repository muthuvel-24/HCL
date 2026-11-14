import java.util.Scanner;

class Employee {
    String employeeName;

    Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    double calculateBonus() {
        return 0;
    }

    double calculateBonus(double amount) {
        return 0;
    }
}

class TechnicalEmployee extends Employee {
    double basicSalary;
    int rating;

    TechnicalEmployee(String name, double salary, int rating) {
        super(name);
        this.basicSalary = salary;
        this.rating = rating;
    }

    @Override
    double calculateBonus() {
        return basicSalary * rating * 2 / 100;
    }

    double calculateBonus(double salary, int employeeRating) {
        return salary * employeeRating * 2 / 100;
    }
}

class SalesEmployee extends Employee {
    double salesAmount;

    SalesEmployee(String name, double salesAmount) {
        super(name);
        this.salesAmount = salesAmount;
    }

    @Override
    double calculateBonus() {
        return salesAmount * 3 / 100;
    }

    @Override
    double calculateBonus(double amount) {
        return amount * 3 / 100;
    }
}

public class EmployeePerformanceBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type = sc.nextInt();
        String name = sc.next();

        Employee employee;
        double amount;

        if (type == 1) {
            double salary = sc.nextDouble();
            int rating = sc.nextInt();

            TechnicalEmployee technical =
                    new TechnicalEmployee(name, salary, rating);
            employee = technical;
            amount = salary;
        } else {
            double sales = sc.nextDouble();

            SalesEmployee salesEmployee = new SalesEmployee(name, sales);
            employee = salesEmployee;
            amount = sales;
        }

        double bonus = employee.calculateBonus();

        System.out.println("Employee Name: " + employee.employeeName);
        System.out.printf("Bonus: %.2f%n", bonus);
        System.out.printf("Total Earnings: %.2f%n", amount + bonus);

        sc.close();
    }
}