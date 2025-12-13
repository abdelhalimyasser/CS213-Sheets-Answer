import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(url.openStream());
            URL url = new URL("https://liveexample.pearsoncmg.com/data/Lincoln.txt");

            int wordCount = 0;

            while (input.hasNext()) {
                input.next();
                wordCount++;
            }

            input.close();
            System.out.println("Total words in Gettysburg Address: " + wordCount);
        } catch (Exception ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        }
    }
}
