package FinalProject;

import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(
            new Electronics("Laptop", 999.99, 2),
            new Clothing("T-Shirt", 19.99, "M"),
            new Grocery("Apple", 0.99, 3)
        );

        Customer customer = new Customer("john_doe");
        customer.addToCart(products.get(0));
        customer.addToCart(products.get(2));

        Order order = new Order(customer.getCart());

        // Apply a 10% discount to electronics
        double total = order.calculateTotal(p -> {
            if (p instanceof Electronics) return p.getPrice() * 0.9;
            return p.getPrice();
        });

        // Add tax (10%) and shipping fee ($5)
        total = addTax.andThen(addShipping).apply(total);
        System.out.printf("Final Total: $%.2f%n", total);

        // Filter products by category
        System.out.println("\nElectronics only:");
        products.stream()
                .filter(p -> p instanceof Electronics)
                .forEach(System.out::println);

        // Sort products by price
        System.out.println("\nSorted by Price:");
        products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .forEach(System.out::println);
    }

    static UnaryOperator<Double> addTax = total -> total * 1.10;
    static UnaryOperator<Double> addShipping = total -> total + 5.0;
}
