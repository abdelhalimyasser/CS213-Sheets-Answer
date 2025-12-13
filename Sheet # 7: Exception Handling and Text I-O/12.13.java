import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main filename");
            return;
        }

        String filename = args[0];
        File file = new File(filename);

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                
                lineCount++;
                charCount += line.length();
                
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty())
                    wordCount += words.length;
            }

            System.out.println("File: " + filename);
            System.out.println("Characters: " + charCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Lines: " + lineCount);

        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + filename);
        }
    }
}
