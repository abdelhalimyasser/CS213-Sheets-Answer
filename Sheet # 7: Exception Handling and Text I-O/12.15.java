import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("Exercise12_15.txt");

        try {
            
            if (!file.exists())
                file.createNewFile();

            try (PrintWriter output = new PrintWriter(file)) {
                for (int i = 0; i < 100; i++) {
                    int num = (int)(Math.random() * 1000);
                    output.print(num + " ");
                }
            }

            List<Integer> numbers = new ArrayList<>();
            try (Scanner input = new Scanner(file)) {
                while (input.hasNextInt()) {
                    numbers.add(input.nextInt());
                }
            }

            Collections.sort(numbers);

            System.out.println("Sorted integers:");
            for (int num : numbers)
                System.out.print(num + " ");

        } catch (IOException ex) {
            System.out.println("Error handling the file: " + ex.getMessage());
        }
    }
}
