package app.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        Set<String> set = new HashSet<>();
        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }
        System.out.println("====================");
        Set<String> set2 = new TreeSet<>();
        set2.add("Tv");
        set2.add("Tablet");
        set2.add("Notebook");

        for (String p : set2) {
            // string sai ordenado
            System.out.println(p);
        }
        System.out.println("====================");
        Set<String> set3 = new LinkedHashSet<>();
        set3.add("Tv");
        set3.add("Tablet");
        set3.add("Notebook");

        for (String p : set3) {
            // string se mantem pela ordem de insercao
            System.out.println(p);
        }
        System.out.println("====================");
        set.removeIf(x -> x.charAt(0) == 'T');
        for (String p : set) {
            System.out.println(p);
        }
    }

}
