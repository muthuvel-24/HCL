import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    double calculateDiscount() {
        return 0;
    }
}

class ElectronicsProduct extends Product {
    ElectronicsProduct(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 12 / 100;
    }
}

class ClothingProduct extends Product {
    ClothingProduct(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 20 / 100;
    }
}

class GroceryProduct extends Product {
    GroceryProduct(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 5 / 100;
    }
}

public class ECommerceProductPricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type = sc.nextInt();
        int id = sc.nextInt();
        String name = sc.next();
        double price = sc.nextDouble();

        Product product;

        if (type == 1) {
            product = new ElectronicsProduct(id, name, price);
        } else if (type == 2) {
            product = new ClothingProduct(id, name, price);
        } else {
            product = new GroceryProduct(id, name, price);
        }

        double discount = product.calculateDiscount();

        System.out.println("Product ID: " + product.productId);
        System.out.println("Product Name: " + product.productName);
        System.out.printf("Discount: %.2f%n", discount);
        System.out.printf("Final Price: %.2f%n", product.price - discount);

        sc.close();
    }
}