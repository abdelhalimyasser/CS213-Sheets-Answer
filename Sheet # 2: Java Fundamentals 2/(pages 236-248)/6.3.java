public class Main {
	public static void main(String[] args) {
		System.out.println(isPalindrome(323));
	}

	public static int reverse(int number){
	    int reverse = 0;
	    while(number != 0){
	        int x = number % 10;
	        reverse = reverse * 10 + x;
	        number /= 10;
	    }
	    return reverse;
	}
    
	public static boolean isPalindrome(int number){
	    return number == reverse(number);
	}
}
