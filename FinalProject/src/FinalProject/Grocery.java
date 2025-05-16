package FinalProject;

public class Grocery extends Product {
    private int shelfLifeDays;

    public Grocery(String name, double price, int shelfLifeDays) {
        super(name, price);
        this.shelfLifeDays = shelfLifeDays;
    }

    @Override
    public String getCategory() {
        return "Grocery";
    }
}
