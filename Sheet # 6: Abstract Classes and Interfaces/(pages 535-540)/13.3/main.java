import java.util.*;

public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(1);
		numbers.add(5);
		numbers.add(6);
		numbers.add(2);
		numbers.add(9);

		System.out.println("Before sorting: " + numbers);
		sort(numbers);
		System.out.println("After sorting: " + numbers);
	}

	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
	}
}
