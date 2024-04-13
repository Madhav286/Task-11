
    import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            // Open the file
            File file = new File("input.txt");
            // Create a Scanner object to read from the file
            Scanner scanner = new Scanner(file);

            // Read and print each line from the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // Close the scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            // Catch and handle the FileNotFoundException
            System.out.println("Error: File not found.");
        }
    }
}

