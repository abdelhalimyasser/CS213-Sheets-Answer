import java.util.*;

public class Main
{
	public static void main(String[] args) {
		ArrayList<Number> numbers = new ArrayList<>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		System.out.println("Before shuffle: " + numbers);
		shuffle(numbers);
		System.out.println("After shuffle: " + numbers);
	}

	public static void shuffle(ArrayList<Number> list) {
		Collections.shuffle(list);
	}
}
