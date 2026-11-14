import java.util.Scanner;

interface Payment {
    double calculateFee(double amount);
}

class CreditCardPayment implements Payment {
    public double calculateFee(double amount) {
        return amount * 2 / 100;
    }
}

class UpiPayment implements Payment {
    public double calculateFee(double amount) {
        return amount * 0.5 / 100;
    }
}

class WalletPayment implements Payment {
    public double calculateFee(double amount) {
        return amount * 1 / 100;
    }
}

public class Q03_OnlinePayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type = sc.nextInt();
        double amount = sc.nextDouble();

        Payment payment;

        if (type == 1) {
            payment = new CreditCardPayment();
        } else if (type == 2) {
            payment = new UpiPayment();
        } else {
            payment = new WalletPayment();
        }

        double fee = payment.calculateFee(amount);

        System.out.printf("Payment Amount: %.2f%n", amount);
        System.out.printf("Transaction Fee: %.2f%n", fee);
        System.out.printf("Final Amount: %.2f%n", amount + fee);

        sc.close();
    }
}