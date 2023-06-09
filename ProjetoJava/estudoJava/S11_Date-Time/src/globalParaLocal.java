import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class globalParaLocal {
    
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        //fuso horario especificado
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        //instante no horario do brasil
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        //instante no horario de portugal
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r2 = " + r3);
        System.out.println("r2 = " + r4);
            System.out.println();
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mes = " + d04.getMonthValue());
        System.out.println("d04 mes = " + d04.getYear());
            System.out.println();
        System.out.println("d05 Hora = " + d05.getHour());
        System.out.println("d05 Minuto = " + d05.getMinute());
        System.out.println("d05 segundo = " + d05.getSecond());

    }
}
