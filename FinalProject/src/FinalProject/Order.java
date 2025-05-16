package FinalProject;

import java.util.*;
import java.util.function.Function;

public class Order {
    private List<Product> items;

    public Order(List<Product> items) {
        this.items = new ArrayList<>(items);
    }

    public double calculateTotal(Function<Product, Double> pricingLogic) {
        return items.stream()
                    .map(pricingLogic)
                    .reduce(0.0, Double::sum);
    }

    public List<Product> getItems() {
        return items;
    }
}
