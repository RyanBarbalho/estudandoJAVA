package app.calculoLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class App2 {

    // public static int compareProducts(Product p1, Product p2) {
    // return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    // }

    public static void main(String[] args) throws Exception {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // list.sort(App2::compareProducts);
        // o compilador deduz que o tipo de p1 e p2 sao Product
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        list.forEach(System.out::println);

        // programacao funcional vs programacao imperativa
        // programacao funcional: funcoes sao tratadas como valores
        List<Integer> lista = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        Integer sum = 0;
        for (Integer x : lista) {
            sum += x;
        }

        System.out.println(sum);
        // programacao funcional
        sum = lista.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
