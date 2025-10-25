public class Main {
	public static void main(String[] args) {
		char[][] answers = {
			{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'D', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
			{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
			{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
		};

		char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

		int[][] studentScores = new int[answers.length][2];

		for (int i = 0; i < answers.length; i++) {
			int correctCount = 0;

			for (int j = 0; j < answers[i].length; j++)
				if (answers[i][j] == key[j])
					correctCount++;

			studentScores[i][0] = i;
			studentScores[i][1] = correctCount;
		}

		java.util.Arrays.sort(studentScores, java.util.Comparator.comparingInt(a -> a[1]));

		for (int[] student : studentScores)
			System.out.println("Student " + student[0] + ": " + student[1] + " correct");
	}
}
