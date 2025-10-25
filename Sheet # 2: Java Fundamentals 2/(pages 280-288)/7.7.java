public class Main {
	public static void main(String[] args) {
	    int[] counts = new int[10];
	    
		  for (int i = 0; i < 100; i++) {
            int digit = (int)(Math.random() * 10);
            counts[digit]++;
        }

      System.out.println("Digit counts from 100 random numbers:");
      for (int i = 0; i < counts.length; i++)
          System.out.println(i + ": " + counts[i]);
	}
}
