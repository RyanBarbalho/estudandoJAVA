package app.map;

import java.util.Map;
import java.util.TreeMap;

public class App {
    // main
    public static void main(String[] args) throws Exception {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");
        cookies.put("phone", "99771133");// sobrescreve o valor da chave phone

        System.out.println("phone number: " + cookies.get("phone"));
        System.out.println("email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));

        System.out.println("ALL COOKIES");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }

}
