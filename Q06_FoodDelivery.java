import java.util.Scanner;

class Delivery {
    double orderAmount;

    Delivery(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    double calculateDeliveryCharge() {
        return orderAmount;
    }
}

class RegularDelivery extends Delivery {
    RegularDelivery(double orderAmount) {
        super(orderAmount);
    }

    @Override
    double calculateDeliveryCharge() {
        return orderAmount + 40.0;
    }
}

class ExpressDelivery extends Delivery {
    ExpressDelivery(double orderAmount) {
        super(orderAmount);
    }

    @Override
    double calculateDeliveryCharge() {
        return orderAmount + 80.0 + (orderAmount * 5 / 100);
    }
}

public class Q06_FoodDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type = sc.nextInt();
        double amount = sc.nextDouble();

        Delivery delivery;

        if (type == 1) {
            delivery = new RegularDelivery(amount);
        } else {
            delivery = new ExpressDelivery(amount);
        }

        System.out.printf("%.2f%n", delivery.calculateDeliveryCharge());
        sc.close();
    }
}