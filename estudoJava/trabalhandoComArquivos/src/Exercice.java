import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exercice {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Locale.setDefault(Locale.US);
        String path = "C:\\temp\\in.txt";
        File file = new File(path);

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2])));

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        String outPath = "C:\\temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outPath))) {
            // colocando (path, true) ele vai adicionar ao final do arquivo (append)
            // se nao tiver ele vai sobrescrever o arquivo
            for (Product products : list) {
                bw.write(products.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
