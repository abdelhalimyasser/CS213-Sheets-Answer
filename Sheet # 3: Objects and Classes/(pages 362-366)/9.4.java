import java.util.Random;

public class Main
{
	public static void main(String[] args) {
		Random random = new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.print(random.nextInt(100) + " ");
            if ((i + 1) % 10 == 0) System.out.println();
        }
	}
}
