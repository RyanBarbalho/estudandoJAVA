package app.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class App2 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Mouse", 50.00));

        // list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        // List<String> names =
        // list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        names.forEach(System.out::println);

    }
}
