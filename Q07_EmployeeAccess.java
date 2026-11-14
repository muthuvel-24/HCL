import java.util.Scanner;

interface AccessControl {
    String getRole();
    int getAccessLevel();
    boolean canAccess(int requiredLevel);
}

class Developer implements AccessControl {
    public String getRole() {
        return "Developer";
    }

    public int getAccessLevel() {
        return 1;
    }

    public boolean canAccess(int requiredLevel) {
        return getAccessLevel() >= requiredLevel;
    }
}

class Manager implements AccessControl {
    public String getRole() {
        return "Manager";
    }

    public int getAccessLevel() {
        return 2;
    }

    public boolean canAccess(int requiredLevel) {
        return getAccessLevel() >= requiredLevel;
    }
}

class Administrator implements AccessControl {
    public String getRole() {
        return "Administrator";
    }

    public int getAccessLevel() {
        return 3;
    }

    public boolean canAccess(int requiredLevel) {
        return getAccessLevel() >= requiredLevel;
    }
}

public class Q07_EmployeeAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type = sc.nextInt();
        int requiredLevel = sc.nextInt();

        AccessControl employee;

        if (type == 1) {
            employee = new Developer();
        } else if (type == 2) {
            employee = new Manager();
        } else {
            employee = new Administrator();
        }

        System.out.println("Role: " + employee.getRole());
        System.out.println("Access Level: " + employee.getAccessLevel());
        System.out.println("Can Access: " + employee.canAccess(requiredLevel));

        sc.close();
    }
}