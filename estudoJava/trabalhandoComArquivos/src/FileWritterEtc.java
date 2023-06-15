import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterEtc {
    // main
    public static void main(String[] args) throws Exception {
        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
        String path = "C:\\temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            // colocando (path, true) ele vai adicionar ao final do arquivo (append)
            // se nao tiver ele vai sobrescrever o arquivo
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
