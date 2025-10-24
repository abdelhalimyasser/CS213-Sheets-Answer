import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();

        String topStudent = "";
        double topScore = 0;

        String secondStudent = "";
        double secondScore = 0;

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            String name = input.next();

            System.out.print("Enter student score: ");
            double score = input.nextDouble();

            if (score > topScore) {
                secondScore = topScore;
                secondStudent = topStudent;

                topScore = score;
                topStudent = name;
            } 
            else if (score > secondScore) {
                secondScore = score;
                secondStudent = name;
            }
        }

        System.out.println("Top student: " + topStudent + " with score " + topScore);
        System.out.println("Second top student: " + secondStudent + " with score " + secondScore);
    }
}
