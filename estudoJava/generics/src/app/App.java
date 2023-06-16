package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> myInts = new ArrayList<Integer>();
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjects = new ArrayList<Object>();

        myInts.add(10);
        myInts.add(5);

        List<? extends Number> list = myInts;
        Number x = list.get(0);
        // list.add(20); // Error
        // covariancia

        myObjects.add("Hello");
        myObjects.add("Bingus");
        printList(myObjects);

        // contravariancia
        // Number x = myNums.get(0); // Error

        copy(myInts, myObjects);
        printList(myObjects);

        copy(myDoubles, myObjects);
        printList(myObjects);

    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

}
