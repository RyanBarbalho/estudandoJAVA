package entities;

public class Product implements Comparable<Product> {
    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setPrice(Double price) {
        if (price == null || price <= 0) {
            throw new IllegalArgumentException("Price cannot be empty");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s, %.2f", getName(), getPrice());
    }

    @Override
    public int compareTo(Product p) {
        return getName().toUpperCase().compareTo(p.getName().toUpperCase());
    }

    public static boolean staticProductPredicate(Product p) {
        return p.getPrice() >= 100.0;
    }

    public boolean nonStaticProductPredicate() {
        return getPrice() >= 100.0;
    }

    public static String staticUpperCaseName(Product p) {
        return p.getName().toUpperCase();
    }
}
