import java.io.File;
import java.util.Scanner;

public class manipulateFiles {
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter folder path: ");
        String folderPath = sc.nextLine();
        File path = new File(folderPath);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");
        for (File file : files) {
            System.out.println(file);
        }
        // create a new directory (folder)
        boolean success = new File(folderPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);

        System.out.println("getName:" + files[0].getName());
        System.out.println("getParent:" + files[0].getParent());
        System.out.println("getPath:" + files[0].getPath());
        sc.close();
    }
}
