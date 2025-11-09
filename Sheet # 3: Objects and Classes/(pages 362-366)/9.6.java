import java.util.Random;

public class Main
{
	public static void main(String[] args) {
		int[] arr = new int[100000];

		Random rand = new Random();
		StopWatch stopWatch = new StopWatch();

		// fill the array with random numbers
		for(int i = 0; i < arr.length; i++)
			arr[i] = rand.nextInt(100000);

		// start the stopwatch
		stopWatch.start();

		// selection sort algrothim
		for(int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex])
					minIndex = j;
			}

			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}

		// stop the stopwatch
		stopWatch.stop();

		System.out.println("The Total Elaspsed Time: " + stopWatch.getElapsedTime() + " mS");
	}
}


class StopWatch {
	// Class Variabels
	private long startTime;
	private long endTime;

	// Class constractor
	public StopWatch() {
		this.startTime = System.currentTimeMillis();
	}

	// Getter methods
	public long getStartTime() {
		return startTime;
	}

	// Class functional methods
	public long getEndTime() {
		return endTime;
	}

	public void start() {
		this.startTime = System.currentTimeMillis();
	}

	public void stop() {
		this.endTime = System.currentTimeMillis();
	}

	public long getElapsedTime() {
		return endTime - startTime;
	}
}
