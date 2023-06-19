package app.predicate;

import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import entities.Product;

public class App2 {

    public static void main(String[] args) throws Exception {
        List<Product> list = new ArrayList<>();
        Locale.setDefault(Locale.US);

        list.add(new Product("TV", 80.00));
        list.add(new Product("Notebook", 350.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Mouse", 50.00));

        // list.removeIf(Product::staticProductPredicate);

        // list.removeIf(Product::nonStaticProductPredicate);

        // Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        // list.removeIf(pred);

        list.removeIf(p -> p.getPrice() >= 100.0);

        list.forEach(System.out::println);
    }
}
