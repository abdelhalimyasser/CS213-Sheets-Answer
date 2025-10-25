public class Main {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		double[][] matrix = new double[4][4];

		System.out.println("Enter a 4-by-4 matrix row by row:");
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix.length; j++)
				matrix[i][j] = input.nextDouble();

		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
	}

	public static double sumMajorDiagonal(double[][] matrix) {
		double sum = 0;
		for (int i = 0; i < matrix.length; i++)
			sum += matrix[i][i];
		return sum;
	}
}
