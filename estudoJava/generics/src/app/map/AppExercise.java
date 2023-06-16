package app.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AppExercise {
    // main
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file path");
        String path = sc.nextLine();
        Map<String, Integer> map = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int votes = Integer.parseInt(fields[1]);

                if (map.containsKey(name)) {
                    int votesSoFar = map.get(name);
                    map.put(name, votes + votesSoFar);
                } else {
                    map.put(name, votes);
                }

                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        sc.close();
    }

}
