package app.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AppExercise2 {
    // main
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students for course A?");
        int a = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a; i++) {
            int x = sc.nextInt();
            set.add(x);
        }
        System.out.println("How many students for course B?");
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            int x = sc.nextInt();
            set.add(x);
        }
        System.out.println("How many students for course C?");
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            int x = sc.nextInt();
            set.add(x);
        }
        System.out.println("Total students: " + set.size());
    }
}
