import java.util.Scanner;

class Vehicle {
    double dailyRate;

    Vehicle(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    double calculateRentalCharge(int rentalDays) {
        return dailyRate * rentalDays;
    }

    String getVehicleType() {
        return "Vehicle";
    }
}

class Car extends Vehicle {
    Car() {
        super(1500.0);
    }

    @Override
    String getVehicleType() {
        return "Car";
    }
}

class Bike extends Vehicle {
    Bike() {
        super(600.0);
    }

    @Override
    String getVehicleType() {
        return "Bike";
    }
}

class Truck extends Vehicle {
    Truck() {
        super(3000.0);
    }

    @Override
    String getVehicleType() {
        return "Truck";
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type = sc.nextInt();
        int days = sc.nextInt();

        Vehicle vehicle;

        if (type == 1) {
            vehicle = new Car();
        } else if (type == 2) {
            vehicle = new Bike();
        } else {
            vehicle = new Truck();
        }

        System.out.println("Vehicle Type: " + vehicle.getVehicleType());
        System.out.printf("Rental Charge: %.2f%n",
                vehicle.calculateRentalCharge(days));

        sc.close();
    }
}