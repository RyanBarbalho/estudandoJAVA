import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        //esse ngc de locale serve pra mudar a "," pra ".", como é usado 
        //nos estados unidos
        
        String product1 = "computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f\n%s, which price is %.2f",product1 ,price, product2, price2);
        System.out.printf("\n\nRecord: %d years old, code %d and gender: %c\n\n", age, code, gender);
        System.out.printf("Measue with eight decimal places: %.8f\n", measure);
        
        System.out.printf("Rouded (three decimal places): %.3f\n",measure); 
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f\n", measure);

    }
}
