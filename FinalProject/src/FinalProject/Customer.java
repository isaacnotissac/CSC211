package FinalProject;

import java.util.*;

public class Customer extends User {
    private List<Product> cart;

    public Customer(String username) {
        super(username);
        this.cart = new ArrayList<>();
    }

    public void addToCart(Product p) {
        cart.add(p);
    }

    public List<Product> getCart() {
        return cart;
    }
}
